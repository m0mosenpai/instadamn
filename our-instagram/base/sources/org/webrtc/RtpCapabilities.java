package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public class RtpCapabilities {
    public List codecs;
    public List headerExtensions;

    /* loaded from: classes12.dex */
    public class CodecCapability {
        public Integer clockRate;
        public MediaStreamTrack.MediaType kind;
        public String mimeType;
        public String name;
        public Integer numChannels;
        public Map parameters;
        public int preferredPayloadType;

        public CodecCapability(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, String str2, Map map) {
            this.preferredPayloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
            this.mimeType = str2;
        }

        public Integer getClockRate() {
            return this.clockRate;
        }

        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        public String getName() {
            return this.name;
        }

        public Integer getNumChannels() {
            return this.numChannels;
        }

        public Map getParameters() {
            return this.parameters;
        }

        public int getPreferredPayloadType() {
            return this.preferredPayloadType;
        }

        public CodecCapability() {
        }
    }

    /* loaded from: classes12.dex */
    public class HeaderExtensionCapability {
        public final boolean preferredEncrypted;
        public final int preferredId;
        public final String uri;

        public HeaderExtensionCapability(String str, int i, boolean z) {
            this.uri = str;
            this.preferredId = i;
            this.preferredEncrypted = z;
        }

        public boolean getPreferredEncrypted() {
            return this.preferredEncrypted;
        }

        public int getPreferredId() {
            return this.preferredId;
        }

        public String getUri() {
            return this.uri;
        }
    }

    public RtpCapabilities(List list, List list2) {
        this.headerExtensions = list2;
        this.codecs = list;
    }

    public List getCodecs() {
        return this.codecs;
    }

    public List getHeaderExtensions() {
        return this.headerExtensions;
    }
}
