package com.instagram.bugreporter.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R7;
import X.C3R8;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.C3SG;
import X.C57114PVd;
import X.C70220WId;
import X.C71702WzB;
import X.InterfaceC09390do;
import X.PVl;
import X.PVn;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.bugreporter.source.BugReportSource;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
/* loaded from: classes9.dex */
public final class BugReport implements Parcelable {
    public static final C3R9[] A0P;
    public final BugReportSource A00;
    public final AttachmentCounter A01;
    public final AttachmentCounter A02;
    public final AttachmentCounter A03;
    public final AttachmentCounter A04;
    public final File A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final Map A0N;
    public final boolean A0O;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new C70220WId(27);

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57114PVd.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.instagram.bugreporter.model.BugReport$Companion] */
    static {
        PVl pVl = PVl.A00;
        C3SG c3sg = new C3SG(pVl);
        C3SG c3sg2 = new C3SG(new C3SG(pVl));
        C3SG c3sg3 = new C3SG(pVl);
        C3SG c3sg4 = new C3SG(pVl);
        C3R8 A00 = C3R7.A00("com.instagram.bugreporter.source.BugReportSource", BugReportSource.values());
        C3RD c3rd = C3RD.A01;
        C3RL c3rl = new C3RL(c3rd, c3rd);
        SerialDescriptor serialDescriptor = AttachmentCounter.A01;
        InterfaceC09390do interfaceC09390do = BugReportAttachmentMediaSource.A00;
        C3R9 c3r9 = (C3R9) interfaceC09390do.getValue();
        C14360o3.A0B(c3r9, 0);
        PVn pVn = new PVn(c3r9);
        C3R9 c3r92 = (C3R9) interfaceC09390do.getValue();
        C14360o3.A0B(c3r92, 0);
        PVn pVn2 = new PVn(c3r92);
        C3R9 c3r93 = (C3R9) interfaceC09390do.getValue();
        C14360o3.A0B(c3r93, 0);
        PVn pVn3 = new PVn(c3r93);
        C3R9 c3r94 = (C3R9) interfaceC09390do.getValue();
        C14360o3.A0B(c3r94, 0);
        A0P = new C3R9[]{null, null, c3sg, c3sg2, c3sg3, c3sg4, null, null, null, null, A00, c3rl, null, null, null, null, null, null, null, null, pVn, pVn2, pVn3, new PVn(c3r94), null};
    }

    public BugReport(BugReportSource bugReportSource, AttachmentCounter attachmentCounter, AttachmentCounter attachmentCounter2, AttachmentCounter attachmentCounter3, AttachmentCounter attachmentCounter4, File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, Map map, boolean z) {
        AbstractC25233BEq.A0x(3, list, list2, list3);
        C14360o3.A0B(list4, 6);
        AbstractC25229BEm.A1L(bugReportSource, 11, map);
        C14360o3.A0B(str13, 20);
        C14360o3.A0B(attachmentCounter, 21);
        C14360o3.A0B(attachmentCounter2, 22);
        C14360o3.A0B(attachmentCounter3, 23);
        C14360o3.A0B(attachmentCounter4, 24);
        this.A0A = str;
        this.A07 = str2;
        this.A0K = list;
        this.A0L = list2;
        this.A0J = list3;
        this.A0M = list4;
        this.A08 = str3;
        this.A09 = str4;
        this.A0I = str5;
        this.A06 = str6;
        this.A00 = bugReportSource;
        this.A0N = map;
        this.A0O = z;
        this.A0H = str7;
        this.A0B = str8;
        this.A0D = str9;
        this.A0C = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A01 = attachmentCounter;
        this.A02 = attachmentCounter2;
        this.A03 = attachmentCounter3;
        this.A04 = attachmentCounter4;
        this.A05 = file;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0K);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A0L);
        while (A0u2.hasNext()) {
            Iterator A0u3 = AbstractC25231BEo.A0u(parcel, (List) A0u2.next());
            while (A0u3.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0u3, i);
            }
        }
        Iterator A0u4 = AbstractC25231BEo.A0u(parcel, this.A0J);
        while (A0u4.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u4, i);
        }
        Iterator A0u5 = AbstractC25231BEo.A0u(parcel, this.A0M);
        while (A0u5.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u5, i);
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A06);
        AbstractC166997dE.A1I(parcel, this.A00);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A0N);
        while (A0s.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A0s));
        }
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeSerializable(this.A05);
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BugReport(BugReportSource bugReportSource, AttachmentCounter attachmentCounter, AttachmentCounter attachmentCounter2, AttachmentCounter attachmentCounter3, AttachmentCounter attachmentCounter4, File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, Map map, int i, @Serializable(with = C71702WzB.class) boolean z) {
        if (33553407 != (i & 33553407)) {
            AbstractC68612VXn.A00(C57114PVd.A01, i, 33553407);
            throw C00O.createAndThrow();
        }
        this.A0A = str;
        this.A07 = str2;
        this.A0K = list;
        this.A0L = list2;
        this.A0J = list3;
        this.A0M = list4;
        this.A08 = str3;
        this.A09 = str4;
        this.A0I = str5;
        this.A06 = str6;
        this.A00 = (i & 1024) == 0 ? BugReportSource.A0K : bugReportSource;
        this.A0N = map;
        this.A0O = z;
        this.A0H = str7;
        this.A0B = str8;
        this.A0D = str9;
        this.A0C = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A01 = attachmentCounter;
        this.A02 = attachmentCounter2;
        this.A03 = attachmentCounter3;
        this.A04 = attachmentCounter4;
        this.A05 = file;
    }
}
