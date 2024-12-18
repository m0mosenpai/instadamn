package X;

import android.os.Bundle;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.My5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51968My5 extends AbstractC184688Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ EnumC33447EqK A03;
    public final /* synthetic */ C69963Cf A04;
    public final /* synthetic */ MediaCaptureConfig A05;
    public final /* synthetic */ EnumC69983Ch A06;
    public final /* synthetic */ UpcomingEvent A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
    }

    public C51968My5(Bundle bundle, EnumC33447EqK enumC33447EqK, C69963Cf c69963Cf, MediaCaptureConfig mediaCaptureConfig, EnumC69983Ch enumC69983Ch, UpcomingEvent upcomingEvent, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = c69963Cf;
        this.A05 = mediaCaptureConfig;
        this.A0A = z;
        this.A0B = z2;
        this.A06 = enumC69983Ch;
        this.A01 = i;
        this.A02 = bundle;
        this.A03 = enumC33447EqK;
        this.A0D = z3;
        this.A07 = upcomingEvent;
        this.A08 = str;
        this.A09 = list;
        this.A0C = z4;
        this.A00 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (X.C15900qk.A00(r15, false) < 78643200) goto L10;
     */
    @Override // X.AbstractC184688Hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A02(java.lang.Object r20) {
        /*
            r19 = this;
            int r16 = X.AbstractC166987dD.A0H(r20)
            r4 = r19
            X.3Cf r6 = r4.A04
            com.instagram.model.creation.MediaCaptureConfig r3 = r4.A05
            boolean r15 = r4.A0A
            boolean r0 = r4.A0B
            X.3Ch r14 = r4.A06
            int r1 = r4.A01
            android.os.Bundle r10 = r4.A02
            X.EqK r7 = r4.A03
            boolean r8 = r4.A0D
            com.instagram.user.model.UpcomingEvent r13 = r4.A07
            java.lang.String r12 = r4.A08
            java.util.List r2 = r4.A09
            boolean r9 = r4.A0C
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            int r5 = r4.A00
            java.lang.String r4 = "openBuiltInGallery"
            if (r15 != 0) goto L2c
            if (r0 == 0) goto L43
        L2c:
            if (r16 == 0) goto L43
            X.EqK r0 = X.EnumC33447EqK.A0J
            if (r7 != r0) goto L66
            android.content.Context r15 = r6.A03
            r0 = 0
            X.C15900qk.A01()
            long r17 = X.C15900qk.A00(r15, r0)
            r15 = 78643200(0x4b00000, double:3.88549034E-316)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L66
        L43:
            java.lang.Integer r0 = X.C05F.A0I
            com.instagram.common.session.UserSession r3 = r6.A04
            X.AbstractC31718DwN.A01(r3, r0)
            android.content.Context r0 = r6.A03
            java.io.File r2 = X.AbstractC13530mf.A04(r0)
            r6.A01 = r2
            if (r2 == 0) goto L5b
            X.3Ca r1 = r6.A05
            r0 = 10002(0x2712, float:1.4016E-41)
            r1.En7(r2, r0)
        L5b:
            X.JZk r0 = X.AbstractC208269Jl.A00(r3)
            X.C0J8.A01()
            X.C43822JZk.A01(r0, r4)
            return
        L66:
            X.14I r0 = X.C14H.A03
            r0.A00()
            android.content.Context r4 = r6.A03
            java.lang.Class<com.instagram.creation.activity.MediaCaptureActivity> r0 = com.instagram.creation.activity.MediaCaptureActivity.class
            android.content.Intent r4 = X.MSW.A08(r4, r0)
            r0 = 65536(0x10000, float:9.1835E-41)
            r4.setFlags(r0)
            java.lang.String r0 = "captureType"
            r4.putExtra(r0, r14)
            java.lang.String r0 = "captureConfig"
            r4.putExtra(r0, r3)
            r0 = 1161(0x489, float:1.627E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r4.putExtra(r0, r1)
            com.instagram.common.session.UserSession r3 = r6.A04
            X.AbstractC31173DnH.A18(r4, r3)
            boolean r1 = X.F17.A00(r7)
            java.lang.String r0 = "newGalleryEligibleEntryPoint"
            r4.putExtra(r0, r1)
            if (r13 == 0) goto La0
            java.lang.String r0 = "upcoming_event"
            r4.putExtra(r0, r13)
        La0:
            if (r12 == 0) goto La7
            java.lang.String r0 = "linked_highlight_id"
            r4.putExtra(r0, r12)
        La7:
            if (r2 == 0) goto Lb2
            java.util.ArrayList r1 = X.AbstractC166987dD.A1F(r2)
            java.lang.String r0 = "highlight_media_ids"
            r4.putStringArrayListExtra(r0, r1)
        Lb2:
            r2 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r11, r2)
            if (r0 == 0) goto Lbe
            java.lang.String r0 = "is_quiet_posting_flow"
            r4.putExtra(r0, r9)
        Lbe:
            if (r10 == 0) goto Lc3
            r4.putExtras(r10)
        Lc3:
            android.os.Bundle r0 = r4.getExtras()
            java.lang.String r1 = "cameraEntryPoint"
            if (r0 == 0) goto Ld8
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Ld8
            X.22P r0 = X.C69963Cf.A00(r7, r6)
            r4.putExtra(r1, r0)
        Ld8:
            if (r8 == 0) goto Le7
            X.MZu r1 = X.AbstractC50666MYj.A00(r3)
            r1.A03 = r2
            X.22P r0 = X.C69963Cf.A00(r7, r6)
            r1.A07(r0)
        Le7:
            X.3Ca r0 = r6.A05
            r0.EnX(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51968My5.A02(java.lang.Object):void");
    }
}
