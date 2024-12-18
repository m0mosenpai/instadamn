package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import com.facebook.proxygen.TraceFieldType;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes9.dex */
public final class ImagineRawData extends C0T6 {

    @SerializedName("media_type")
    public final String mediaType;

    @SerializedName("prompt")
    public final String prompt;

    @SerializedName(TraceFieldType.RequestID)
    public final String requestId;

    @SerializedName("response_id")
    public final String responseId;

    @SerializedName("temporary_handle")
    public final String temporaryHandle;

    @SerializedName("uri")
    public final String uri;

    public static /* synthetic */ ImagineRawData copy$default(ImagineRawData imagineRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str6;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        if ((i & 1) != 0) {
            str12 = imagineRawData.mediaType;
        }
        if ((i & 2) != 0) {
            str11 = imagineRawData.prompt;
        }
        if ((i & 4) != 0) {
            str10 = imagineRawData.uri;
        }
        if ((i & 8) != 0) {
            str9 = imagineRawData.temporaryHandle;
        }
        if ((i & 16) != 0) {
            str8 = imagineRawData.requestId;
        }
        if ((i & 32) != 0) {
            str7 = imagineRawData.responseId;
        }
        return new ImagineRawData(str12, str11, str10, str9, str8, str7);
    }

    public final String component1() {
        return this.mediaType;
    }

    public final String component2() {
        return this.prompt;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.temporaryHandle;
    }

    public final String component5() {
        return this.requestId;
    }

    public final String component6() {
        return this.responseId;
    }

    public final ImagineRawData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ImagineRawData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImagineRawData) {
                ImagineRawData imagineRawData = (ImagineRawData) obj;
                if (!C14360o3.A0K(this.mediaType, imagineRawData.mediaType) || !C14360o3.A0K(this.prompt, imagineRawData.prompt) || !C14360o3.A0K(this.uri, imagineRawData.uri) || !C14360o3.A0K(this.temporaryHandle, imagineRawData.temporaryHandle) || !C14360o3.A0K(this.requestId, imagineRawData.requestId) || !C14360o3.A0K(this.responseId, imagineRawData.responseId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final String getTemporaryHandle() {
        return this.temporaryHandle;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.mediaType) * 31) + AbstractC167017dG.A0O(this.prompt)) * 31) + AbstractC167017dG.A0O(this.uri)) * 31) + AbstractC167017dG.A0O(this.temporaryHandle)) * 31) + AbstractC167017dG.A0O(this.requestId)) * 31) + AbstractC25227BEk.A07(this.responseId);
    }

    public ImagineRawData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mediaType = str;
        this.prompt = str2;
        this.uri = str3;
        this.temporaryHandle = str4;
        this.requestId = str5;
        this.responseId = str6;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineRawData(mediaType=");
        A1C.append(this.mediaType);
        A1C.append(", prompt=");
        A1C.append(this.prompt);
        A1C.append(", uri=");
        A1C.append(this.uri);
        A1C.append(", temporaryHandle=");
        A1C.append(this.temporaryHandle);
        A1C.append(", requestId=");
        A1C.append(this.requestId);
        A1C.append(", responseId=");
        return AbstractC25236BEt.A0Y(this.responseId, A1C);
    }
}
