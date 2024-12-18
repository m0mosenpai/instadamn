package com.facebook.realtime.requeststream.builder.dgw;

/* loaded from: classes.dex */
public interface StreamGroupDecider {

    /* loaded from: classes2.dex */
    public class StreamGroupDecision {
        public String groupName;
        public boolean removeStreamGroupOnError;
        public final int streamGroupType;

        public String getGroupName() {
            return this.groupName;
        }

        public int getStreamGroupType() {
            return this.streamGroupType;
        }

        public StreamGroupDecision(String str) {
            this.removeStreamGroupOnError = false;
            this.streamGroupType = 2;
            this.groupName = str;
        }

        public void setRemoveStreamGroupOnError(boolean z) {
            this.removeStreamGroupOnError = z;
        }

        public StreamGroupDecision() {
            this.groupName = "";
            this.removeStreamGroupOnError = false;
            this.streamGroupType = 1;
        }
    }

    StreamGroupDecision getStreamGroupDecision(String str);
}
