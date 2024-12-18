package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.UUID;

/* renamed from: X.9Jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208259Jk implements AnonymousClass822 {
    public final int A00;
    public final Object A01;

    public C208259Jk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int intValue;
        C208769Lk c208769Lk;
        C81W c81w;
        switch (this.A00) {
            case 2:
                C55U c55u = (C55U) obj;
                C14360o3.A0B(c55u, 0);
                C208679Lb c208679Lb = (C208679Lb) this.A01;
                if (!C14360o3.A0K(c208679Lb.A00, c55u)) {
                    boolean equals = c55u.equals(C1811381p.A00);
                    InterfaceC09390do interfaceC09390do = c208679Lb.A05;
                    ACX acx = (ACX) interfaceC09390do.getValue();
                    if (equals) {
                        String obj2 = UUID.randomUUID().toString();
                        C14360o3.A07(obj2);
                        acx.A02(obj2);
                        ((ACX) interfaceC09390do.getValue()).A01("enter_browser");
                        c208679Lb.A04.A03.getValue();
                        AbstractC59962oe abstractC59962oe = c208679Lb.A01;
                        if (abstractC59962oe.isVisible()) {
                            C14240no c14240no = new C14240no(abstractC59962oe.getChildFragmentManager());
                            C24H c24h = C24H.CAMERA;
                            Bundle bundle = new Bundle();
                            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c24h);
                            bundle.putBoolean("apply_top_bottom_margin", false);
                            C52153N6d c52153N6d = new C52153N6d();
                            c52153N6d.setArguments(bundle);
                            c14240no.A0A(c52153N6d, R.id.clips_template_browser_fragment_holder);
                            c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                            c14240no.A0I("clips_template_browser_fragment");
                            c14240no.A00();
                        }
                        c208679Lb.A03.A00().A0L(false);
                    } else {
                        acx.A01("swipe_exit_template_browser");
                        ((ACX) interfaceC09390do.getValue()).A00();
                        AbstractC59962oe abstractC59962oe2 = c208679Lb.A01;
                        if (abstractC59962oe2.isVisible() && !abstractC59962oe2.getChildFragmentManager().A11()) {
                            abstractC59962oe2.getChildFragmentManager().A0x("clips_template_browser_fragment", 1);
                        }
                    }
                }
                c208679Lb.A00 = c55u;
                return;
            case 3:
                CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
                C14360o3.A0B(cameraConfiguration, 0);
                C8FG.A03(cameraConfiguration, (C8FG) this.A01);
                return;
            case 4:
                AbstractC55106ObM.A01((AbstractC55106ObM) this.A01, 29, false, !((Boolean) obj).booleanValue(), false, false, false);
                return;
            case 5:
                intValue = ((Number) obj).intValue();
                c208769Lk = (C208769Lk) this.A01;
                EnumC1810181d AuG = c208769Lk.A0R.AuG();
                if (AuG != EnumC1810181d.A11 && AuG != EnumC1810181d.A08) {
                    return;
                }
                c81w = C81W.A0U;
                break;
                break;
            case 6:
                int intValue2 = ((Number) obj).intValue();
                C208769Lk c208769Lk2 = (C208769Lk) this.A01;
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        return;
                    }
                    Integer num = c208769Lk2.A02;
                    Integer num2 = C05F.A01;
                    if (num == num2) {
                        return;
                    }
                    c208769Lk2.A02 = num2;
                    AnonymousClass229.A01(c208769Lk2.A0H).A0o(1);
                    if (!C1810981l.A05(C81W.A0z, c208769Lk2.A0J) || c208769Lk2.A01 == EnumC172837mv.A0I) {
                        return;
                    }
                    C208769Lk.A0E(c208769Lk2, false);
                    C22918A8o A01 = C208769Lk.A01(c208769Lk2);
                    C208769Lk.A0B(c208769Lk2, (int) A01.A03, (int) A01.A00);
                    C208769Lk.A06(c208769Lk2);
                    C208769Lk.A0A(c208769Lk2, 0);
                    return;
                }
                Integer num3 = c208769Lk2.A02;
                Integer num4 = C05F.A00;
                if (num3 == num4) {
                    return;
                }
                c208769Lk2.A02 = num4;
                AnonymousClass229.A01(c208769Lk2.A0H).A0o(2);
                if (!C1810981l.A05(C81W.A0z, c208769Lk2.A0J) || c208769Lk2.A01 == EnumC172837mv.A0I) {
                    return;
                }
                C208769Lk.A0E(c208769Lk2, false);
                C22918A8o A012 = C208769Lk.A01(c208769Lk2);
                C208769Lk.A0B(c208769Lk2, (int) A012.A03, (int) A012.A00);
                C208769Lk.A0C(c208769Lk2, c208769Lk2.A01);
                return;
            case 7:
                intValue = ((Number) obj).intValue();
                c208769Lk = (C208769Lk) this.A01;
                c81w = C81W.A10;
                break;
            case 8:
                C55U c55u2 = (C55U) obj;
                C14360o3.A0B(c55u2, 0);
                C23851Ah3.A02(c55u2, (C23851Ah3) this.A01);
                return;
            default:
                C14360o3.A0B(obj, 0);
                ((InterfaceC24741Ir) this.A01).F8s(obj);
                return;
        }
        C208769Lk.A05(c81w, c208769Lk, intValue);
    }
}
