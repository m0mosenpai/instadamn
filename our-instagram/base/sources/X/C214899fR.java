package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.arads.ArAdsUIModel;

/* renamed from: X.9fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C214899fR extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ArAdsCommerceCameraFragment";
    public ViewGroup A00;
    public AAB A01;
    public C150486px A02;
    public EffectAttribution A03;
    public InterfaceC150356pk A04;
    public C22954A9y A05;
    public AAM A06;
    public C22867A6n A07;
    public C22990ABp A08;
    public C22911A8h A09;
    public C23632AdR A0A;
    public C70185WFo A0B;
    public TargetViewSizeProvider A0C;
    public InterfaceC1821285w A0D;
    public ArAdsUIModel A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public C22P A0J;
    public final InterfaceC09390do A0M = AbstractC60492pY.A02(this);
    public final C19L A0N = AbstractC167017dG.A0w(C12L.A00, 559423850);
    public final InterfaceC09390do A0O = AbstractC09440dt.A01(new C57508Pfi(this, 10));
    public final C22975AAz A0L = new C22975AAz(this);
    public final C23088AFw A0K = new C23088AFw(this);

    public String getModuleName() {
        return "ar_ads_camera";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d4  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214899fR.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final AAB A01() {
        AAB aab = this.A01;
        if (aab != null) {
            return aab;
        }
        C14360o3.A0F("arCommerceCameraController");
        throw C00O.createAndThrow();
    }

    public final C23656Adr A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C214619ez) {
            interfaceC09390do = ((C214619ez) this).A0C;
        } else {
            interfaceC09390do = this.A0O;
        }
        return (C23656Adr) interfaceC09390do.getValue();
    }

    public final ArAdsUIModel A03() {
        ArAdsUIModel arAdsUIModel = this.A0E;
        if (arAdsUIModel != null) {
            return arAdsUIModel;
        }
        C14360o3.A0F("arAdsUIModel");
        throw C00O.createAndThrow();
    }

    public final Integer A04() {
        Integer num = this.A0F;
        if (num != null) {
            return num;
        }
        C14360o3.A0F("cameraMode");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59972of
    public final void beforeOnDestroy() {
        C22954A9y c22954A9y = this.A05;
        if (c22954A9y == null) {
            C14360o3.A0F("arAdsMetricsLogger");
            throw C00O.createAndThrow();
        }
        if (!c22954A9y.A02) {
            c22954A9y.A02 = true;
            c22954A9y.A00 += SystemClock.uptimeMillis() - c22954A9y.A01;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c22954A9y.A04), "ar_ads_experience_close_fb4a");
        if (A0f.isSampled()) {
            String str = c22954A9y.A05;
            if (str == null) {
                str = "";
            }
            A0f.AAP(MSV.A00(80), str);
            A0f.A8I("view_time", Double.valueOf(c22954A9y.A00));
            A0f.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r1 == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C214899fR r6, java.io.File r7, java.lang.String r8) {
        /*
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L85
            r0 = 42
            java.lang.String r0 = X.MSV.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            X.22P r1 = r6.A0J
            java.lang.String r0 = "camera_entry_point"
            r5.putSerializable(r0, r1)
            java.lang.String r1 = r7.getCanonicalPath()
            java.lang.String r0 = "preset_medium_file_path"
            r5.putString(r0, r1)
            java.lang.String r1 = r6.A0H
            if (r1 != 0) goto L30
            java.lang.String r0 = "effectId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L30:
            java.lang.String r0 = "effect_id"
            r5.putString(r0, r1)
            java.lang.String r0 = "media_type"
            r5.putString(r0, r8)
            com.instagram.model.arads.ArAdsUIModel r0 = r6.A03()
            r4 = 0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L4a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L4b
        L4a:
            r0 = 1
        L4b:
            r0 = r0 ^ 1
            r1 = r0 ^ 1
            java.lang.String r0 = "use_effect_attribution"
            r5.putBoolean(r0, r1)
            java.lang.String r0 = "ads_client_token"
            r5.putString(r0, r2)
            X.0do r0 = r6.A0M
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 3920(0xf50, float:5.493E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r1 = X.C6XJ.A02(r1, r5, r3, r2, r0)
            android.content.Context r0 = r6.getContext()
            r1.A0C(r0)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            r0.finish()
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            r0.overridePendingTransition(r4, r4)
            return
        L85:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214899fR.A00(X.9fR, java.io.File, java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-60089912);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            InterfaceC09390do interfaceC09390do = this.A0M;
            this.A04 = AbstractC149806oZ.A00(AbstractC166987dD.A0o(interfaceC09390do));
            this.A0G = bundle2.getString(AbstractC43591JPw.A00(19));
            String string = bundle2.getString("effect_id");
            AbstractC153636vY.A03(bundle2, string, "effect_id");
            this.A0H = string;
            this.A0I = bundle2.getString(AbstractC111324zv.A00(3222));
            ArAdsUIModel arAdsUIModel = (ArAdsUIModel) AbstractC153636vY.A00(bundle2, ArAdsUIModel.class, AbstractC111324zv.A00(721));
            C14360o3.A0B(arAdsUIModel, 0);
            this.A0E = arAdsUIModel;
            TargetViewSizeProvider targetViewSizeProvider = (TargetViewSizeProvider) AbstractC153636vY.A00(bundle2, TargetViewSizeProvider.class, AbstractC111324zv.A00(1925));
            C14360o3.A0B(targetViewSizeProvider, 0);
            this.A0C = targetViewSizeProvider;
            AbstractC131165w4.A00();
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C22975AAz c22975AAz = this.A0L;
            ArAdsUIModel A03 = A03();
            TargetViewSizeProvider targetViewSizeProvider2 = this.A0C;
            if (targetViewSizeProvider2 != null) {
                AbstractC167007dF.A1K(A0r, c22975AAz);
                this.A06 = new AAM(c22975AAz, A0r, targetViewSizeProvider2, A03);
                this.A07 = new C22867A6n(AbstractC166987dD.A0r(interfaceC09390do), getModuleName());
                Integer num = C05F.A00;
                C14360o3.A0B(num, 0);
                this.A0F = num;
                String string2 = bundle2.getString(MSV.A00(42));
                String string3 = bundle2.getString("media_id");
                this.A0J = AbstractC167027dH.A0C(bundle2, "camera_entry_point");
                AbstractC131165w4.A00();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0B(A0r2, 0);
                this.A05 = new C22954A9y(A0r2, string2, string3);
                C23656Adr.A00(EnumC223239t9.A0h, A02());
                C0f9.A09(1400214970, A02);
                return;
            }
            C14360o3.A0F("targetViewSizeProvider");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(406924511, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1775857265);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.arads_commerce_camera_fragment_layout, viewGroup, false);
        C14360o3.A07(inflate);
        C0f9.A09(-428668303, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1262443387);
        super.onDestroy();
        C23632AdR c23632AdR = this.A0A;
        if (c23632AdR != null) {
            c23632AdR.A0B.A03.A09.destroy();
            A02().A02(EnumC223239t9.A0i, "", null);
            C23656Adr A022 = A02();
            long j = A022.A00;
            if (j != 0) {
                boolean z = A022.A04;
                C1QT c1qt = A022.A01;
                if (z) {
                    c1qt.flowAnnotate(j, TraceFieldType.ErrorCode, 0);
                    c1qt.flowAnnotate(A022.A00, TraceFieldType.ErrorDomain, "com.instagram.arfx.effect.arads");
                    long j2 = A022.A00;
                    String str = A022.A03;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    c1qt.flowAnnotate(j2, TraceFieldType.Error, str);
                    long j3 = A022.A00;
                    String str3 = A022.A02;
                    String str4 = A022.A03;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    c1qt.flowEndFail(j3, str3, AbstractC166997dE.A0z("errorMessage: %s", AbstractC166997dE.A1b(str2, 1)));
                } else {
                    c1qt.flowEndSuccess(j);
                }
                A022.A00 = 0L;
                A022.A04 = false;
                A022.A02 = "";
                A022.A03 = null;
            }
            C0f9.A09(-904497987, A02);
            return;
        }
        C14360o3.A0F("cameraInitializationController");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1827741603);
        super.onDestroyView();
        C70185WFo c70185WFo = this.A0B;
        if (c70185WFo != null) {
            c70185WFo.A0A.A02(c70185WFo.A0B, C191228dL.class);
        }
        C0f9.A09(409527319, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(-651014221);
        super.onPause();
        C22954A9y c22954A9y = this.A05;
        if (c22954A9y == null) {
            str = "arAdsMetricsLogger";
        } else {
            if (!c22954A9y.A02) {
                c22954A9y.A02 = true;
                c22954A9y.A00 += SystemClock.uptimeMillis() - c22954A9y.A01;
            }
            C23632AdR c23632AdR = this.A0A;
            if (c23632AdR != null) {
                c23632AdR.A06 = false;
                AKN akn = c23632AdR.A0B.A03;
                int i = akn.A00;
                if (i != 0) {
                    if (i == 1) {
                        akn.A09.A05(akn.A0C);
                    }
                } else {
                    akn.A0E.EG8(akn.A0H);
                }
                akn.A09.pause();
                C0f9.A09(-737878259, A02);
                return;
            }
            str = "cameraInitializationController";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1931907570);
        super.onResume();
        C22954A9y c22954A9y = this.A05;
        if (c22954A9y == null) {
            str = "arAdsMetricsLogger";
        } else {
            c22954A9y.A02 = false;
            c22954A9y.A01 = SystemClock.uptimeMillis();
            C23632AdR c23632AdR = this.A0A;
            if (c23632AdR != null) {
                c23632AdR.A03(null, A04());
                Activity rootActivity = getRootActivity();
                C14360o3.A0A(rootActivity);
                this.A0M.getValue();
                AbstractC65987Txg.A00(rootActivity);
                C0f9.A09(-1784610249, A02);
                return;
            }
            str = "cameraInitializationController";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-238785255);
        super.onStart();
        C23632AdR c23632AdR = this.A0A;
        if (c23632AdR != null) {
            c23632AdR.A07 = true;
            C0f9.A09(-2114626585, A02);
        } else {
            C14360o3.A0F("cameraInitializationController");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-450077923);
        super.onStop();
        C23632AdR c23632AdR = this.A0A;
        if (c23632AdR != null) {
            c23632AdR.A07 = false;
            c23632AdR.A04 = false;
            C0f9.A09(-1998489947, A02);
            return;
        }
        C14360o3.A0F("cameraInitializationController");
        throw C00O.createAndThrow();
    }
}
