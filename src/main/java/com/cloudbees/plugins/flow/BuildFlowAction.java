/*
 Copyright (C) 2011 CloudBees Inc.

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU Affero General Public License
 as published by the Free Software Foundation; either version 3
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, see <http://www.gnu.org/licenses/>.
*/
package com.cloudbees.plugins.flow;

import hudson.model.Action;

/**
 * @author <a href="mailto:nicolas.deloof@cloudbees.com">Nicolas De loof</a>
 */
public class BuildFlowAction implements Action {

    private final FlowRun flow;

    public BuildFlowAction(FlowRun flow) {
        this.flow = flow;
    }

    public FlowRun getFlow() {
        return flow;
    }

    public String getIconFileName() {
        return "/plugin/build-flow-plugin/images/16x16/flow.png";
    }

    public String getDisplayName() {
        return Messages.BuildFlowAction_Messages();
    }

    public String getUrlName() {
        return flow.getFlow().getAbsoluteUrl();
    }
}