package X;

import android.app.Notification;
import android.text.SpannableString;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.stickerstore.StickerPack;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.phonenumber.model.CountryCodeData;
import go.Seq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51761Mtk extends C0T6 {
    public Object A00;
    public final int A01;
    public final Object A02;

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C51761Mtk) && ((C51761Mtk) obj).A01 == i) {
            return true;
        }
        return false;
    }

    public final String A03() {
        String str;
        CountryCodeData countryCodeData = (CountryCodeData) this.A00;
        if (countryCodeData == null || (str = countryCodeData.A00) == null) {
            return "";
        }
        return str;
    }

    public final String A04() {
        String str;
        CountryCodeData countryCodeData = (CountryCodeData) this.A00;
        if (countryCodeData == null || (str = countryCodeData.A02) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ba A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51761Mtk.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51761Mtk.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A01) {
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("EncryptedBackupInfo(lastSyncTimeMs=");
                A1C.append(this.A02);
                str = ", creationTimeMs=";
                break;
            case 8:
                A1C = AbstractC166987dD.A1C();
                A1C.append("HeaderFields(title=");
                A1C.append(this.A02);
                str = ", subtitle=";
                break;
            case 17:
                A1C = AbstractC166987dD.A1C();
                A1C.append("InboxThreadDigestData(threadData=");
                A1C.append(this.A02);
                str = ", messageForDigestData=";
                break;
            case 20:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MediaForAutoplayFields(messageIdentifier=");
                A1C.append(this.A02);
                str = ", media=";
                break;
            case 38:
                A1C = AbstractC166987dD.A1C();
                A1C.append("FaceSwarmImageAnimation(before=");
                A1C.append(this.A02);
                str = ", after=";
                break;
            default:
                return super.toString();
        }
        A1C.append(str);
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public static final C51761Mtk A00(OpalProfileData opalProfileData, C74 c74) {
        AbstractC167017dG.A1N(opalProfileData, c74);
        return new C51761Mtk(opalProfileData, c74);
    }

    public static final C51761Mtk A01(List list, List list2) {
        AbstractC167017dG.A1N(list, list2);
        return new C51761Mtk(list, list2, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51761Mtk(com.instagram.opal.impl.data.OpalProfileData r15, X.C74 r16, kotlin.jvm.internal.DefaultConstructorMarker r17, int r18, int r19) {
        /*
            r14 = this;
            r0 = 46
            r14.A01 = r0
            r6 = 0
            r10 = 1
            java.lang.String r2 = ""
            r9 = 0
            X.C74 r1 = X.C74.A07
            X.0sl r8 = X.C16930sl.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51761Mtk.<init>(com.instagram.opal.impl.data.OpalProfileData, X.C74, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C51761Mtk(CountryCodeData countryCodeData, Integer num, int i) {
        this.A01 = 40;
        countryCodeData = (i & 1) != 0 ? null : countryCodeData;
        num = (i & 2) != 0 ? C05F.A0C : num;
        this.A01 = 40;
        C14360o3.A0B(num, 2);
        this.A00 = countryCodeData;
        this.A02 = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(C5QE c5qe, Integer num, int i) {
        this(41, (i & 2) != 0 ? null : num, (i & 1) != 0 ? null : c5qe);
        this.A01 = 41;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(C51745MtU c51745MtU, C51629MrM c51629MrM, int i) {
        this(39, (i & 1) != 0 ? null : c51745MtU, (i & 2) != 0 ? null : c51629MrM);
        this.A01 = 39;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(StickerPack stickerPack, Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((StickerPack) null, C05F.A00);
        this.A01 = 13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(CharSequence charSequence, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((CharSequence) null, C16930sl.A00);
        this.A01 = 47;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(int i, Integer num) {
        this((i & 1) != 0 ? C05F.A0N : num, (C5Hc) ((i & 2) != 0 ? C5HZ.A01 : null));
        this.A01 = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(C5Hc c5Hc, int i) {
        this((i & 1) != 0 ? C5HZ.A01 : c5Hc, (i & 2) != 0 ? C5HZ.A01 : null);
        this.A01 = 11;
    }

    public C51761Mtk(C38688GzT c38688GzT, List list) {
        this.A01 = 27;
        C14360o3.A0B(c38688GzT, 2);
        this.A02 = list;
        this.A00 = c38688GzT;
    }

    public C51761Mtk(InterfaceC56392iX interfaceC56392iX, IgProgressImageView igProgressImageView) {
        this.A01 = 19;
        C14360o3.A0B(igProgressImageView, 1);
        this.A00 = igProgressImageView;
        this.A02 = interfaceC56392iX;
    }

    public C51761Mtk(L55 l55, List list) {
        this.A01 = 35;
        C14360o3.A0B(list, 2);
        this.A02 = l55;
        this.A00 = list;
    }

    public C51761Mtk(Integer num, Integer num2, int i) {
        this.A01 = i;
        switch (i) {
            case 4:
                break;
            case 25:
                C14360o3.A0B(num, 1);
                break;
            default:
                C14360o3.A0B(num, 1);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 48:
                this.A00 = num;
                this.A02 = num2;
                return;
        }
        this.A02 = num;
        this.A00 = num2;
    }

    public C51761Mtk(C5Hc c5Hc, C5Hc c5Hc2) {
        this.A01 = 11;
        AbstractC167017dG.A1P(c5Hc, c5Hc2);
        this.A00 = c5Hc;
        this.A02 = c5Hc2;
    }

    public C51761Mtk(Integer num, C5Hc c5Hc) {
        this.A01 = 15;
        AbstractC167017dG.A1P(num, c5Hc);
        this.A00 = num;
        this.A02 = c5Hc;
    }

    public C51761Mtk(EnumC33351Eok enumC33351Eok, List list) {
        this.A01 = 37;
        AbstractC167017dG.A1P(list, enumC33351Eok);
        this.A02 = list;
        this.A00 = enumC33351Eok;
    }

    public C51761Mtk(EnumC33352Eol enumC33352Eol, List list) {
        this.A01 = 36;
        AbstractC167017dG.A1P(list, enumC33352Eol);
        this.A02 = list;
        this.A00 = enumC33352Eol;
    }

    public C51761Mtk(AbstractC46430Kgq abstractC46430Kgq, List list) {
        this.A01 = 14;
        AbstractC167017dG.A1P(list, abstractC46430Kgq);
        this.A02 = list;
        this.A00 = abstractC46430Kgq;
    }

    public C51761Mtk(AbstractC46456KhG abstractC46456KhG, List list) {
        this.A01 = 22;
        AbstractC167017dG.A1P(list, abstractC46456KhG);
        this.A02 = list;
        this.A00 = abstractC46456KhG;
    }

    public C51761Mtk(C38321qM c38321qM, List list) {
        this.A01 = 30;
        this.A02 = c38321qM;
        this.A00 = list;
    }

    public C51761Mtk(AbstractC46972Dl abstractC46972Dl, Boolean bool) {
        this.A01 = 16;
        this.A02 = abstractC46972Dl;
        this.A00 = bool;
    }

    public C51761Mtk(EnumC33421Eps enumC33421Eps, List list) {
        this.A01 = 9;
        this.A02 = enumC33421Eps;
        this.A00 = list;
    }

    public C51761Mtk(SpannableString spannableString, List list) {
        this.A01 = 18;
        this.A02 = spannableString;
        this.A00 = list;
    }

    public C51761Mtk(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A01 = 33;
        this.A02 = imageUrl;
        this.A00 = imageUrl2;
    }

    public C51761Mtk(StickerPack stickerPack, Integer num) {
        this.A01 = 13;
        this.A02 = stickerPack;
        this.A00 = num;
    }

    public C51761Mtk(AnonymousClass541 anonymousClass541, ImageUrl imageUrl) {
        this.A01 = 3;
        this.A02 = anonymousClass541;
        this.A00 = imageUrl;
    }

    public C51761Mtk(EnumC33411Epi enumC33411Epi, List list) {
        this.A01 = 7;
        this.A02 = enumC33411Epi;
        this.A00 = list;
    }

    public C51761Mtk(AbstractC46428Kgo abstractC46428Kgo, AbstractC46428Kgo abstractC46428Kgo2) {
        this.A01 = 5;
        this.A02 = abstractC46428Kgo;
        this.A00 = abstractC46428Kgo2;
    }

    public C51761Mtk(Integer num, List list) {
        this.A01 = 0;
        this.A02 = num;
        this.A00 = list;
    }

    public C51761Mtk(C9C6 c9c6, Integer num) {
        this.A01 = 29;
        this.A00 = num;
        this.A02 = c9c6;
    }

    public C51761Mtk(C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier) {
        this.A01 = 20;
        this.A02 = directMessageIdentifier;
        this.A00 = c38321qM;
    }

    public C51761Mtk(MRV mrv, InterfaceC50518MRv interfaceC50518MRv) {
        this.A01 = 17;
        this.A02 = interfaceC50518MRv;
        this.A00 = mrv;
    }

    public C51761Mtk(View.OnClickListener onClickListener, Integer num) {
        this.A01 = 44;
        this.A02 = num;
        this.A00 = onClickListener;
    }

    public C51761Mtk(C51755Mte c51755Mte, EnumC27382C6l enumC27382C6l) {
        this.A01 = 45;
        this.A00 = c51755Mte;
        this.A02 = enumC27382C6l;
    }

    public C51761Mtk(Notification notification, Map map) {
        this.A01 = 21;
        this.A00 = notification;
        this.A02 = map;
    }

    public C51761Mtk(OpalProfileData opalProfileData, C74 c74) {
        this.A01 = 46;
        this.A00 = opalProfileData;
        this.A02 = c74;
    }

    public C51761Mtk(CharSequence charSequence, List list) {
        this.A01 = 47;
        this.A00 = charSequence;
        this.A02 = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk(Integer num) {
        this(num, (Integer) null, 25);
        this.A01 = 25;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51761Mtk() {
        this((C51755Mte) null, EnumC27382C6l.A03);
        this.A01 = 45;
    }

    public C51761Mtk(EnumC68142VDf enumC68142VDf) {
        this.A01 = 43;
        Integer num = C05F.A01;
        this.A01 = 43;
        this.A02 = enumC68142VDf;
        this.A00 = num;
    }

    public C51761Mtk(GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections sections) {
        this.A01 = 1;
        this.A02 = sections;
        this.A00 = null;
    }

    public C51761Mtk(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    public C51761Mtk(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A01 = i;
        this.A02 = charSequence;
        this.A00 = charSequence2;
    }

    public C51761Mtk(List list, List list2, int i) {
        this.A01 = i;
        this.A00 = list;
        this.A02 = list2;
    }

    public C51761Mtk(Map map) {
        this.A01 = 2;
        this.A02 = map;
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37050GUg(this, 12));
    }

    public C51761Mtk(C45127Jxw c45127Jxw) {
        this.A01 = 10;
        ParcelableSnapshotMutableState A0U = AbstractC25230BEn.A0U(AbstractC166997dE.A0a());
        this.A01 = 10;
        C14360o3.A0B(c45127Jxw, 1);
        this.A00 = c45127Jxw;
        this.A02 = A0U;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51761Mtk(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            X.0sl r1 = X.C16930sl.A00
            switch(r3) {
                case 12: goto L10;
                case 23: goto Ld;
                default: goto L7;
            }
        L7:
            r0 = 34
        L9:
            r2.<init>(r1, r1, r0)
            return
        Ld:
            r0 = 23
            goto L9
        L10:
            r0 = 12
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51761Mtk.<init>(int):void");
    }
}
