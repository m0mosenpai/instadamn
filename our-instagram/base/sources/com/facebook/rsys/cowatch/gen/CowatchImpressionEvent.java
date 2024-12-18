package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchImpressionEvent {
    public final long duration;
    public final boolean isSearch;
    public final int itemPosition;
    public final String mediaId;
    public final String rankingRequestId;
    public final String sectionId;
    public final int sectionPosition;
    public final String tabId;
    public final String targetId;

    public static native CowatchImpressionEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchImpressionEvent)) {
                return false;
            }
            CowatchImpressionEvent cowatchImpressionEvent = (CowatchImpressionEvent) obj;
            String str = this.mediaId;
            String str2 = cowatchImpressionEvent.mediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.targetId;
            String str4 = cowatchImpressionEvent.targetId;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            if (this.duration != cowatchImpressionEvent.duration || this.itemPosition != cowatchImpressionEvent.itemPosition || !this.sectionId.equals(cowatchImpressionEvent.sectionId) || this.sectionPosition != cowatchImpressionEvent.sectionPosition || !this.tabId.equals(cowatchImpressionEvent.tabId) || this.isSearch != cowatchImpressionEvent.isSearch || !this.rankingRequestId.equals(cowatchImpressionEvent.rankingRequestId)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.rankingRequestId, (AbstractC166997dE.A0K(this.tabId, (AbstractC166997dE.A0K(this.sectionId, (AbstractC25236BEt.A01(this.duration, (JQ0.A01(AbstractC167017dG.A0O(this.mediaId)) + AbstractC25227BEk.A07(this.targetId)) * 31) + this.itemPosition) * 31) + this.sectionPosition) * 31) + (this.isSearch ? 1 : 0)) * 31);
    }

    public CowatchImpressionEvent(String str, String str2, long j, int i, String str3, int i2, String str4, boolean z, String str5) {
        AbstractC31180DnO.A1U(str3, str4, str5);
        this.mediaId = str;
        this.targetId = str2;
        this.duration = j;
        this.itemPosition = i;
        this.sectionId = str3;
        this.sectionPosition = i2;
        this.tabId = str4;
        this.isSearch = z;
        this.rankingRequestId = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchImpressionEvent{mediaId=");
        A1C.append(this.mediaId);
        A1C.append(",targetId=");
        A1C.append(this.targetId);
        A1C.append(",duration=");
        A1C.append(this.duration);
        A1C.append(",itemPosition=");
        A1C.append(this.itemPosition);
        A1C.append(",sectionId=");
        A1C.append(this.sectionId);
        A1C.append(",sectionPosition=");
        A1C.append(this.sectionPosition);
        A1C.append(",tabId=");
        A1C.append(this.tabId);
        A1C.append(",isSearch=");
        A1C.append(this.isSearch);
        A1C.append(",rankingRequestId=");
        return AbstractC50523MSb.A0W(this.rankingRequestId, A1C);
    }
}
