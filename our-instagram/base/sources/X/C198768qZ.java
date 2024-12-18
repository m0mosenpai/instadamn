package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import java.util.Map;

/* renamed from: X.8qZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198768qZ {
    public boolean A00;
    public final ViewGroup A01;
    public final C55982hj A02;
    public final UserSession A03;
    public final C1821185v A04;
    public final C8FP A05;
    public final C8FL A06;
    public final C198528q1 A07;
    public final InterfaceC1810081c A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final AbstractC59962oe A0B;

    public C198768qZ(View view, C07X c07x, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C1821185v c1821185v, C198528q1 c198528q1, InterfaceC1810081c interfaceC1810081c) {
        C14360o3.A0B(interfaceC1810081c, 4);
        C14360o3.A0B(c1821185v, 5);
        this.A07 = c198528q1;
        this.A03 = userSession;
        this.A08 = interfaceC1810081c;
        this.A04 = c1821185v;
        this.A0B = abstractC59962oe;
        View requireViewById = view.requireViewById(R.id.post_capture_effects_container);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A01 = viewGroup;
        C8FL c8fl = new C8FL(userSession, new C8FH() { // from class: X.8qa
            @Override // X.C8FH
            public final void AVq(C88X c88x, Map map) {
                boolean z;
                C198528q1 c198528q12 = C198768qZ.this.A07;
                InterfaceC143326dX interfaceC143326dX = c198528q12.A03;
                if (interfaceC143326dX != null) {
                    z = interfaceC143326dX.CPd();
                } else {
                    z = false;
                }
                C198538q2 c198538q2 = c198528q12.A0F;
                CameraAREffect A00 = c88x.A00();
                if (A00 != null) {
                    C22C A01 = AnonymousClass229.A01(c198538q2.A00);
                    String str = A00.A0K;
                    EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
                    EnumC114925Hg A002 = AbstractC191238dS.A00(c198538q2.A01);
                    String str2 = A00.A0B;
                    CameraAREffect A003 = c88x.A00();
                    boolean z2 = true;
                    if (A003 == null || !A003.CcN()) {
                        z2 = false;
                    }
                    A01.A13(A002, enumC50631MWs, str, null, str2, map, null, -1, 2, z2, z);
                }
            }

            @Override // X.C8FH
            public final int BMv() {
                return C198768qZ.A00(C198768qZ.this);
            }
        }, new C87Q(null, null, 1));
        this.A06 = c8fl;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C9ET(this, 16));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C9FP(17, view, this, targetViewSizeProvider));
        Context context = view.getContext();
        LayoutInflater.from(context).inflate(R.layout.layout_post_capture_effects_stub, viewGroup, true);
        C8FI c8fi = new C8FI() { // from class: X.8qb
            @Override // X.C8FI
            public final void DDA(C88X c88x) {
                C198768qZ.A04(c88x, C198768qZ.this);
            }

            @Override // X.C8FJ
            public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
                C88X c88x = (C88X) interfaceC120325cX;
                C14360o3.A0B(c88x, 0);
                if (z && C198768qZ.A04(c88x, C198768qZ.this)) {
                    return;
                }
                C198768qZ c198768qZ = C198768qZ.this;
                if (c88x.A04 == C88Z.A0Q) {
                    return;
                }
                C8FP c8fp = c198768qZ.A05;
                c8fp.EMP(i, true);
                c8fp.CtF(i);
                C198528q1 c198528q12 = c198768qZ.A07;
                C8FR AcW = c8fp.AcW();
                C14360o3.A0B(AcW, 1);
                C85B c85b = C85B.A06;
                CameraAREffect A00 = c88x.A00();
                if (A00 == null) {
                    C198528q1.A01(c85b, c198528q12);
                    return;
                }
                C198538q2 c198538q2 = c198528q12.A0F;
                String str2 = A00.A0K;
                C14360o3.A07(str2);
                Integer B0Z = AcW.B0Z(str2);
                if (B0Z == null) {
                    AbstractC12120kG.A08("PostCaptureEffectLogger", AnonymousClass001.A0R("Could not find effect id: ", A00.A0K), null);
                } else {
                    C22C A01 = AnonymousClass229.A01(c198538q2.A00);
                    int intValue = B0Z.intValue();
                    A01.A11(AbstractC191238dS.A00(c198538q2.A01), null, A00.A0K, A00.A0M, A00.A0I, intValue, 2, A00.CcN());
                }
                String str3 = ((C22F) AnonymousClass229.A01(c198528q12.A0B)).A04.A0L;
                c198528q12.A05.Emx(c198528q12.A01, c198528q12.A0C, A00, str3, "dial_select");
                c198528q12.A0I.Egh(A00);
                c198528q12.A0G.A00(c85b, A00.A0K);
                C141796aw A002 = AbstractC141776au.A00(c198528q12);
                C206639Cu c206639Cu = new C206639Cu(c198528q12, null, 24);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A002);
                C8LB c8lb = c198528q12.A09;
                AbstractC18560vj.A03(AbstractC141776au.A00(c198528q12), new C15340po(new C9D3(c198528q12, AcW, (InterfaceC23621Ds) null, 30), C0JE.A00(new C9D3(c8lb, null, 18))));
                c8lb.A00.A00().ETb(A00);
                InterfaceC185638Lg interfaceC185638Lg = c198528q12.A02;
                if (interfaceC185638Lg == null) {
                    return;
                }
                interfaceC185638Lg.DZr(A00);
            }

            @Override // X.C8FJ
            public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
            }
        };
        final C198818qe c198818qe = (C198818qe) this.A0A.getValue();
        C14360o3.A0B(c198818qe, 5);
        C14360o3.A07(context);
        C8FO c8fo = new C8FO(context, abstractC59962oe, userSession, null, c8fl, c8fi, "post_capture", new InterfaceC08830cm() { // from class: X.8qg
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return AnonymousClass884.this;
            }
        });
        this.A05 = c8fo;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        A02.A0A(c8fo.Bp9());
        this.A02 = A02;
        c8fl.A00 = c8fo;
        C0UO c0uo = c198528q1.A04;
        if (c0uo == null) {
            C14360o3.A0F("effectTrayState");
            throw C00O.createAndThrow();
        }
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC58232lf.A00(anonymousClass191, c0uo).A06(c07x, new C198858qi(new C9EB(this, 39)));
        final C05A c05a = c198528q1.A0G.A00;
        AbstractC58232lf.A00(anonymousClass191, new InterfaceC19390xP() { // from class: X.8qm
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }).A06(c07x, new C198858qi(new C9EB(this, 40)));
        AbstractC18560vj.A03(C07Y.A00(c07x), new C15340po(new C9D0(this, null, 21), AbstractC07080Za.A03(c198528q1.A0H)));
    }

    public static final int A00(C198768qZ c198768qZ) {
        C8FP c8fp = c198768qZ.A05;
        int B10 = c8fp.B10();
        int i = 0;
        while (true) {
            if (i >= B10) {
                break;
            }
            C88X B0q = c8fp.B0q(i);
            if (B0q != null && B0q.A04 == C88Z.A0G) {
                if (i != -1) {
                    return i;
                }
            } else {
                i++;
            }
        }
        AbstractC12120kG.A07("PostCaptureEffectPickerController", AnonymousClass001.A0O("getEmptyEffectPosition() invalid emptyEffectPosition ", -1), null);
        return 0;
    }

    public static final void A01(C198768qZ c198768qZ) {
        if (!c198768qZ.A00) {
            c198768qZ.A00 = true;
            C8FP c8fp = c198768qZ.A05;
            c8fp.DDl();
            c8fp.setVisibility(0);
            C55982hj c55982hj = c198768qZ.A02;
            c55982hj.A08(0.0d, true);
            c55982hj.A06(1.0d);
            ((C198818qe) c198768qZ.A0A.getValue()).A00();
        }
    }

    public static final void A02(C198768qZ c198768qZ, String str) {
        C8FP c8fp = c198768qZ.A05;
        c8fp.EFH(c8fp.B0x(str));
        C198528q1 c198528q1 = c198768qZ.A07;
        C141796aw A00 = AbstractC141776au.A00(c198528q1);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50120MBu(c198528q1, str, null, 39), A00);
        C198528q1.A01(C85B.A03, c198528q1);
    }

    public static final void A03(C198768qZ c198768qZ, String str, boolean z) {
        int B0x;
        C8FP c8fp = c198768qZ.A05;
        if (c8fp.CaF()) {
            if (str == null) {
                B0x = A00(c198768qZ);
            } else {
                B0x = c8fp.B0x(str);
            }
            if (c8fp.CaY(B0x)) {
                if (z) {
                    c8fp.EMP(B0x, true);
                } else {
                    c8fp.EMs(null, B0x, false);
                }
                ((C198818qe) c198768qZ.A0A.getValue()).A00();
            }
        }
    }

    public static final boolean A04(C88X c88x, C198768qZ c198768qZ) {
        CameraAREffect A00 = c88x.A00();
        C198528q1 c198528q1 = c198768qZ.A07;
        String A01 = AbstractC189108Zb.A01((C85D) c198528q1.A0G.A00.getValue());
        if (A00 != null && AbstractC50102Ry.A00(A00.A0K, A01)) {
            EffectAttribution B0P = c198528q1.A09.A00.A00().B0P();
            C22P c22p = c198528q1.A01;
            if (A00.A0V == null) {
                C0w9.A03("CameraAREffect", AnonymousClass001.A0R("Cannot open bottom sheet with null primary actions, Effect ID: ", A00.A0K));
            } else {
                String str = A00.A0C;
                if (str != null) {
                    EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A00, str);
                    effectInfoAttributionConfiguration.A00 = B0P;
                    effectInfoAttributionConfiguration.A01 = EffectInfoBottomSheetMode.NORMAL;
                    EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                    effectInfoBottomSheetConfiguration.A02 = ImmutableList.of((Object) effectInfoAttributionConfiguration);
                    effectInfoBottomSheetConfiguration.A00 = 1;
                    effectInfoBottomSheetConfiguration.A01 = c22p;
                    effectInfoBottomSheetConfiguration.A06 = false;
                    C23762AfZ c23762AfZ = new C23762AfZ(c198768qZ);
                    Context context = c198768qZ.A0B.getContext();
                    if (context != null) {
                        AbstractC55031OXo.A02(context, EnumC50631MWs.A0I, c198768qZ.A03, c198528q1.A0C, effectInfoBottomSheetConfiguration, c23762AfZ, null);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
