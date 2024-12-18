package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes6.dex */
public final class E9O extends C0T6 implements YP3 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final DirectSearchResult A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9O) {
                E9O e9o = (E9O) obj;
                if (!C14360o3.A0K(this.A03, e9o.A03) || this.A00 != e9o.A00 || this.A04 != e9o.A04 || this.A01 != e9o.A01 || this.A02 != e9o.A02 || !C14360o3.A0K(this.A06, e9o.A06) || !C14360o3.A0K(this.A05, e9o.A05) || !C14360o3.A0K(this.A07, e9o.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.YP3
    public final String BKg(String str) {
        DirectShareTarget directShareTarget;
        String str2 = this.A06;
        DirectSearchResult directSearchResult = this.A03;
        String str3 = null;
        if ((directSearchResult instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) directSearchResult) != null) {
            str3 = directShareTarget.A09();
        }
        if (str == null) {
            str = "";
        }
        return AnonymousClass001.A0g(str2, str3, str);
    }

    @Override // X.YP3
    public final /* bridge */ /* synthetic */ Object FBH(String str) {
        if (AbstractC13670mt.A0G(str, this.A06)) {
            return this;
        }
        DirectSearchResult directSearchResult = this.A03;
        int i = this.A00;
        return new E9O(directSearchResult, this.A04, str, this.A05, this.A07, i, this.A01, this.A02);
    }

    public final int hashCode() {
        String str;
        int A0G = (AbstractC166987dD.A0G(this.A03) + this.A00) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "IG_NON_CONTACT";
                break;
            case 2:
                str = "IG_PEOPLE_NON_CONTACT";
                break;
            case 3:
                str = "IG_BUSINESS_NON_CONTACT";
                break;
            case 4:
                str = "FB_FRIEND";
                break;
            case 5:
                str = "FB_NON_FRIEND";
                break;
            case 6:
                str = "IG_ONLY_GROUP";
                break;
            case 7:
                str = "XAC_GROUP";
                break;
            case 8:
                str = "REEL";
                break;
            case 9:
                str = "UNJOINED_SOCIAL_CHANNEL";
                break;
            case 10:
                str = "JOINED_SOCIAL_CHANNEL";
                break;
            case 11:
                str = "UNJOINED_BROADCAST_CHANNEL";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "JOINED_BROADCAST_CHANNEL";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "UNJOINED_SUBSCRIBER_SOCIAL_CHANNEL";
                break;
            case 14:
                str = "JOINED_SUBSCRIBER_SOCIAL_CHANNEL";
                break;
            case Process.SIGTERM /* 15 */:
                str = "UNJOINED_SUBSCRIBER_BROADCAST_CHANNEL";
                break;
            case 16:
                str = "JOINED_SUBSCRIBER_BROADCAST_CHANNEL";
                break;
            case 17:
                str = "CHANNEL_SUGGESTED_USER";
                break;
            case 18:
                str = "CHANNEL_CATEGORY";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "AI_AGENT";
                break;
            case 20:
                str = "UGC_AGENT";
                break;
            case 21:
                str = "INVITE_CONTACT";
                break;
            default:
                str = "IG_CONTACT";
                break;
        }
        return ((((AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A01, AbstractC25231BEo.A0H(str, intValue, A0G))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A07);
    }

    public E9O(DirectSearchResult directSearchResult, Integer num, String str, String str2, List list, int i, long j, long j2) {
        AbstractC167017dG.A1Q(directSearchResult, num);
        this.A03 = directSearchResult;
        this.A00 = i;
        this.A04 = num;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = list;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectOmniLoggingItem(result=");
        A1C.append(this.A03);
        A1C.append(", uiSection=");
        A1C.append(this.A00);
        A1C.append(", interopType=");
        Integer num = this.A04;
        if (num != null) {
            str = F92.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", absolutePosition=");
        A1C.append(this.A01);
        A1C.append(", relativePosition=");
        A1C.append(this.A02);
        A1C.append(", query=");
        A1C.append(this.A06);
        A1C.append(", mnetRequestId=");
        A1C.append(this.A05);
        A1C.append(", preselectedIds=");
        return AbstractC167017dG.A0o(this.A07, A1C);
    }
}
