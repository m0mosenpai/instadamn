package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8FG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FG implements InterfaceC11380iw, InterfaceC1119153d, InterfaceC149856oe, C8FH, InterfaceC1810781j, C8FI, AnonymousClass851, C85H {
    public static final String __redex_internal_original_name = "DialPickerController";
    public int A00;
    public C88X A01;
    public C88X A02;
    public C8TN A03;
    public C177787vC A04;
    public C8HJ A05;
    public C69608VsB A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public java.util.Set A0A;
    public boolean A0B;
    public final Activity A0C;
    public final Handler A0D;
    public final View A0E;
    public final C2GT A0F;
    public final C55982hj A0G;
    public final InterfaceC55932he A0H;
    public final AnonymousClass845 A0I;
    public final C85Z A0J;
    public final UserSession A0K;
    public final C1810981l A0L;
    public final AnonymousClass880 A0M;
    public final C1821185v A0N;
    public final C8FP A0O;
    public final C8FK A0P;
    public final AnonymousClass860 A0Q;
    public final InterfaceC1810081c A0R;
    public final AnonymousClass825 A0S;
    public final Runnable A0T;
    public final String A0U;
    public final HashSet A0V;
    public final boolean A0W;
    public final C1824487j A0X;
    public final C8FL A0Y;
    public final C1824987o A0Z;

    private final void A01() {
        this.A04 = null;
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            C88X c88x = C88X.A0T;
            C14360o3.A08(c88x);
            c8fp.A8M(c88x, 0);
            c8fp.EFH(1);
            c8fp.ETk(null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.7vC, java.lang.Object] */
    public static final void A05(C8FG c8fg, C189118Zc c189118Zc, boolean z) {
        CameraAREffect A00;
        AnonymousClass860 anonymousClass860 = c8fg.A0Q;
        String str = null;
        if (!anonymousClass860.A0H.CSx()) {
            C1810981l c1810981l = c8fg.A0L;
            AbstractC12120kG.A07("ig_camera", AnonymousClass001.A0R("The current formats does not support AR effects, camerastate=", AbstractC226029yL.A00((C55U) c1810981l.A08.A00, (java.util.Set) c1810981l.A09.A00)), null);
            return;
        }
        C1824487j c1824487j = c8fg.A0X;
        String str2 = c189118Zc.A02;
        C56E c56e = C56E.A06;
        C56E.A00(c56e, true);
        if (!c56e.A02 && AbstractC001800i.A0u(c1824487j.A00, str2)) {
            Context context = c8fg.A0E.getContext();
            C9GR.A03(context, context.getResources().getString(2131976219), null, 1);
            return;
        }
        C8FP c8fp = c8fg.A0O;
        if (c8fp != null) {
            int B0x = c8fp.B0x(str2);
            if (c8fp.CaY(B0x)) {
                C88X B0q = c8fp.B0q(B0x);
                if (B0q == null) {
                    C0w9.A03("DialElementConverter", "toAREffects() found null arEffect");
                    A00 = null;
                } else {
                    A00 = B0q.A00();
                }
                String A002 = c189118Zc.A00();
                String str3 = c189118Zc.A03;
                if (B0q != null && B0q.A04 == C88Z.A0G) {
                    str = "empty_effect_selected";
                }
                c8fg.A02(A00, A002, str3, str, B0x, z);
                c8fg.A0N.CMh();
                return;
            }
            String str4 = c189118Zc.A03;
            ?? obj = new Object();
            obj.A00 = str2;
            obj.A01 = str4;
            c8fg.A04 = obj;
            c8fg.A0N.A00();
            if (anonymousClass860.A0g) {
                A00(c8fg);
            }
            C141796aw A003 = AbstractC141776au.A00(anonymousClass860);
            C9D3 c9d3 = new C9D3(anonymousClass860, c189118Zc, (InterfaceC23621Ds) null, 29);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A003);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d0, code lost:
    
        if ((r7 instanceof X.C189118Zc) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d2, code lost:
    
        r7 = (X.C189118Zc) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d4, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
    
        r6 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01da, code lost:
    
        r5 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e0, code lost:
    
        if (X.C14360o3.A0K(r6, r5) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e2, code lost:
    
        r5 = r7.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e8, code lost:
    
        if (r25.A04 != r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ea, code lost:
    
        r7 = "empty_effect_selected";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
    
        A02(r0, r5, r26, r7, r27, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f4, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f6, code lost:
    
        r5 = "dial_select";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0220, code lost:
    
        if (r14 != r6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if ((r7 instanceof X.C81S) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
    
        if (r14 != X.C88Z.A08) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0189, code lost:
    
        r6 = r25.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018d, code lost:
    
        if (r6 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018f, code lost:
    
        X.AbstractC12120kG.A08("EffectTrayLogger", "logDialSelection() logs empty effect", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        r14 = X.AnonymousClass229.A01(r8);
        r15 = X.AbstractC191238dS.A00(r7);
        r8 = r6.A0K;
        r7 = r6.A0M;
        r22 = r6.CcN();
        r14.A11(r15, X.AbstractC189108Zb.A00(r11), r8, r7, r6.A0I, r27, X.AbstractC203568zH.A00(r11), r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0197, code lost:
    
        r6 = r25.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0199, code lost:
    
        if (r6 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        r7 = r10.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        if (r7 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019f, code lost:
    
        X.C14360o3.A0A(r6);
        r8 = X.AbstractC38048Gob.A01(r6.A01);
        r7.A05 = X.AbstractC41555Ia4.A00(r8);
        r7.A0F.A03(r8);
        r7 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b5, code lost:
    
        if (r7 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        X.C14360o3.A0B(r8, 0);
        r6 = r7.A06;
        r6.add(r8.A0H);
        r7.A00 = r6.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c7, code lost:
    
        r7 = (X.C85D) r9.getValue();
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    @Override // X.C8FJ
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDC(X.C88X r25, java.lang.String r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FG.DDC(X.88X, java.lang.String, int, boolean):void");
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    @Override // X.C8FI
    public final void DDA(C88X c88x) {
        String str;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        ProductAREffectContainer productAREffectContainer;
        Product A04;
        User user;
        CameraAREffect A00 = c88x.A00();
        if (c88x.A04 == C88Z.A04 && A00 != null) {
            AnonymousClass860 anonymousClass860 = this.A0Q;
            if (anonymousClass860.A0H.Aky()) {
                C1821385x c1821385x = anonymousClass860.A0C;
                boolean z = anonymousClass860.A0g;
                C1821585z c1821585z = anonymousClass860.A0Q;
                C22P c22p = anonymousClass860.A0P.A00;
                IgCameraEffectsController igCameraEffectsController = c1821385x.A00.A05;
                if (A00.equals(igCameraEffectsController.A09)) {
                    if (A00.A0V == null) {
                        C0w9.A03("CameraAREffect", AnonymousClass001.A0R("Cannot open bottom sheet with null primary actions, Effect ID: ", A00.A0K));
                        return;
                    }
                    if (c1821585z != null && (A04 = c1821585z.A04()) != null && (user = A04.A0B) != null) {
                        str = user.getUsername();
                    } else {
                        str = A00.A0C;
                        if (str == null) {
                            AbstractC12120kG.A07("EffectInfoBottomSheetConfigurationProvider", AnonymousClass001.A0R("The attribution_username is null in the effect: ", A00.A0K), null);
                            return;
                        }
                    }
                    AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
                    EffectAttribution effectAttribution = null;
                    if (anonymousClass818 == null) {
                        AbstractC12120kG.A01("IgCameraEffectsController", "MQRenderer is null");
                    } else if (anonymousClass818.A0D() != null) {
                        effectAttribution = igCameraEffectsController.A07.A0D().mAttribution;
                    }
                    EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A00, str);
                    effectInfoAttributionConfiguration.A00 = effectAttribution;
                    if (c1821585z != null) {
                        if (C22P.A0U == c1821585z.A00) {
                            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING_TEST;
                        } else {
                            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
                        }
                    } else if (z) {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.TRY_ON;
                    } else {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
                    }
                    effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
                    if (c1821585z != null) {
                        ProductItemWithAR A01 = c1821585z.A0F.A01(c1821585z.A05);
                        C14360o3.A0A(A01);
                        ProductArEffectMetadata productArEffectMetadata = A01.A00;
                        Product A03 = c1821585z.A03();
                        C14360o3.A0A(A03);
                        C14360o3.A0B(A03, 0);
                        ProductItemWithAR productItemWithAR = new ProductItemWithAR(productArEffectMetadata, A03.A01);
                        boolean z2 = false;
                        if (c1821585z.A04() != null) {
                            z2 = true;
                        }
                        boolean z3 = !z2;
                        ?? obj = new Object();
                        obj.A00 = productItemWithAR;
                        obj.A01 = z3;
                        productAREffectContainer = obj;
                    } else {
                        productAREffectContainer = null;
                    }
                    effectInfoAttributionConfiguration.A05 = productAREffectContainer;
                    EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                    effectInfoBottomSheetConfiguration.A02 = ImmutableList.of((Object) effectInfoAttributionConfiguration);
                    boolean z4 = false;
                    effectInfoBottomSheetConfiguration.A00 = 0;
                    effectInfoBottomSheetConfiguration.A01 = c22p;
                    if (z && c22p != C22P.A3w) {
                        z4 = true;
                    }
                    effectInfoBottomSheetConfiguration.A06 = z4;
                    if (c1821585z != null) {
                        effectInfoBottomSheetConfiguration.A05 = !c1821585z.A05();
                    }
                    UserSession userSession = this.A0K;
                    Context context = this.A0C;
                    if (context == null) {
                        context = this.A0E.getContext();
                    }
                    AbstractC55031OXo.A02(context, EnumC50631MWs.A0J, userSession, (C55U) this.A0L.A08.A00, effectInfoBottomSheetConfiguration, this, this);
                }
            }
        }
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        boolean z = false;
        if (f == 0.0f) {
            z = true;
        }
        this.A08 = !z;
    }

    @Override // X.InterfaceC149856oe
    public final void Dfc(String str) {
        C14360o3.A0B(str, 0);
        A09(str);
    }

    @Override // X.InterfaceC149856oe
    public final void Dfd() {
    }

    @Override // X.InterfaceC149856oe
    public final void Dkc() {
    }

    @Override // X.InterfaceC149856oe
    public final void EFE(String str) {
        C14360o3.A0B(str, 0);
        AbstractC55031OXo.A01(this.A0E.getContext());
        A09(str);
    }

    public static final int A00(C8FG c8fg) {
        int i = c8fg.A00 + (c8fg.A0Q.A0H.Bv5() ? 1 : 0);
        C8FP c8fp = c8fg.A0O;
        if (c8fp != null) {
            C88X c88x = C88X.A0U;
            C14360o3.A08(c88x);
            c8fp.A8M(c88x, i);
            c8fp.notifyDataSetChanged();
            return i;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(CameraAREffect cameraAREffect, String str, String str2, String str3, int i, boolean z) {
        String str4;
        C203588zK c203588zK;
        String str5;
        String str6;
        JSONObject jSONObject;
        String str7 = str3;
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            c8fp.EMP(i, z);
            c8fp.CtF(i);
            AnonymousClass860 anonymousClass860 = this.A0Q;
            C1821585z c1821585z = anonymousClass860.A0Q;
            if (c1821585z != null && (jSONObject = (JSONObject) c1821585z.A0J.get(c1821585z.A05)) != null) {
                try {
                    jSONObject.putOpt("selected_id", c1821585z.A0K.get(c1821585z.A05));
                } catch (JSONException unused) {
                    C0w9.A03(C1821585z.__redex_internal_original_name, "Could not write DeepLink JSON");
                }
                str4 = jSONObject.toString();
            } else {
                str4 = null;
            }
            if (cameraAREffect != null) {
                C8HJ c8hj = this.A05;
                if (c8hj != null) {
                    c8hj.Dl0(false);
                }
                UserSession userSession = anonymousClass860.A0F;
                String str8 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
                AnonymousClass830 anonymousClass830 = anonymousClass860.A08;
                C1811981v c1811981v = anonymousClass860.A0G.A08;
                anonymousClass830.Emx(anonymousClass860.A0P.A00, (C55U) c1811981v.A00, cameraAREffect, str8, str);
                if (cameraAREffect.A0Q == null) {
                    EnumC203578zI A00 = AbstractC189108Zb.A00(((C85D) anonymousClass860.A05.A00.getValue()).A00);
                    if (A00 != null) {
                        str6 = A00.toString();
                    } else {
                        str6 = null;
                    }
                    cameraAREffect.A0Q = str6;
                }
                if ("INSTAGRAM_CAMERA".equals(cameraAREffect.A0E)) {
                    c203588zK = new C203588zK(anonymousClass860);
                    C006802i c006802i = anonymousClass860.A0D;
                    c006802i.markerStart(660604063);
                    Object obj = c1811981v.A00;
                    if (obj instanceof C208509Kk) {
                        str5 = "stories";
                    } else if (obj instanceof C81U) {
                        str5 = "clips";
                    } else if (obj instanceof C81S) {
                        str5 = "live";
                    } else {
                        str5 = anonymousClass860.A0R;
                    }
                    c006802i.markerAnnotate(660604063, "surface", str5);
                } else {
                    c203588zK = null;
                }
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324187690053590L);
                if (A06) {
                    C1821385x c1821385x = anonymousClass860.A0C;
                    C23574AcT c23574AcT = new C23574AcT(anonymousClass860);
                    C1815383g c1815383g = c1821385x.A00;
                    c1815383g.A06(c23574AcT);
                    c1815383g.A05.A0P.add(new A5R(anonymousClass860));
                }
                AbstractC18560vj.A03(AbstractC141776au.A00(anonymousClass860), new C15340po(new C9DA(anonymousClass860, (InterfaceC23621Ds) null, A06), C0JE.A00(new EffectRenderingService$applyEffect$1(cameraAREffect, anonymousClass860.A0C, c203588zK, str4, str2, null))));
            } else {
                if (str3 == null) {
                    str7 = "dial_apply_null_effect";
                }
                A08(str7);
            }
            C8HJ c8hj2 = this.A05;
            if (c8hj2 != null) {
                c8hj2.CuD(anonymousClass860.A0C.A00.A05.A09, cameraAREffect);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(CameraConfiguration cameraConfiguration, C8FG c8fg) {
        boolean z;
        C55U c55u = cameraConfiguration.A03;
        java.util.Set set = cameraConfiguration.A04;
        java.util.Set set2 = c8fg.A0A;
        c8fg.A0A = Collections.unmodifiableSet(set);
        C81W c81w = C81W.A0C;
        if (set.contains(c81w) || set2.contains(c81w)) {
            c8fg.A0R.E4u(new Object());
        }
        AnonymousClass880 anonymousClass880 = c8fg.A0M;
        if (anonymousClass880 != null && anonymousClass880.A00().CaF() && !(c55u instanceof C81V)) {
            anonymousClass880.A00().FB1(1.0f);
        }
        C81W c81w2 = C81W.A0K;
        if ((set.contains(c81w2) && !set2.contains(c81w2)) || (!set.contains(c81w2) && set2.contains(c81w2))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.notifyDataSetChanged();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (c8fg.A0R.AuH() != EnumC1810381f.A02) {
            C8FP c8fp2 = c8fg.A0O;
            if (c8fp2 != null) {
                c8fp2.Cw3(set);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A04(C8FG c8fg) {
        C88X c88x = c8fg.A02;
        if (c88x != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                int Bsl = c8fp.Bsl();
                boolean EFG = c8fp.EFG(c88x);
                c8fg.A0V.remove(c88x);
                if (EFG) {
                    int i = c8fg.A00;
                    if (i > 0) {
                        c8fg.A00 = i - 1;
                    } else {
                        AbstractC12120kG.A07(__redex_internal_original_name, "Attempting to decrement saved count, but already zero", null);
                    }
                    c8fg.A02 = null;
                    c8fp.EMs(null, Bsl, false);
                    C88X B0q = c8fp.B0q(Bsl);
                    if (B0q != null && B0q.A04 == C88Z.A04) {
                        String id = B0q.getId();
                        C14360o3.A07(id);
                        A05(c8fg, new C189118Zc(C85B.A06, id, AbstractC203558zG.A00(c8fg.A0Q.A0P.A00), null, null, null, null, -1, false), true);
                    } else {
                        c8fg.A0A("dial_apply_null_effect");
                        if (B0q == null) {
                            return;
                        }
                    }
                    C8HJ c8hj = c8fg.A05;
                    if (c8hj != null) {
                        c8hj.DA9(B0q);
                        c8fp.ETk(B0q.A0G);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A06(C8FG c8fg, boolean z) {
        C88X AuN;
        CameraAREffect A00;
        C8FP c8fp = c8fg.A0O;
        if (c8fp != null && (AuN = c8fp.AuN()) != null && (A00 = AuN.A00()) != null) {
            if (A00.CcN() == z) {
                AbstractC12120kG.A07(__redex_internal_original_name, "Attempting to save/unsave an effect that was already saved/unsaved", null);
                return;
            }
            if (!c8fg.A0Q.A0H.Bvf()) {
                return;
            }
            if (z) {
                C88X Bsa = c8fp.Bsa();
                if (Bsa == null || Bsa.A00() == null) {
                    return;
                }
                HashSet hashSet = c8fg.A0V;
                if (hashSet.contains(Bsa)) {
                    return;
                }
                int Bsl = c8fp.Bsl() + 1;
                hashSet.add(Bsa);
                c8fp.A8M(Bsa, c8fg.A00);
                c8fg.A00++;
                c8fp.notifyDataSetChanged();
                c8fp.EMs(null, Bsl, false);
                return;
            }
            if (c8fp.Bsl() <= c8fg.A00) {
                c8fg.A02 = AuN;
                return;
            }
            HashSet hashSet2 = c8fg.A0V;
            if (!hashSet2.contains(AuN)) {
                return;
            }
            int Bsl2 = c8fp.Bsl() - 1;
            boolean EFG = c8fp.EFG(AuN);
            hashSet2.remove(AuN);
            c8fp.notifyDataSetChanged();
            if (!EFG) {
                return;
            }
            int i = c8fg.A00;
            if (i > 0) {
                c8fg.A00 = i - 1;
            } else {
                AbstractC12120kG.A07(__redex_internal_original_name, "Attempting to decrement saved count, but already zero", null);
            }
            c8fp.EMs(null, Bsl2, false);
            C88X B0q = c8fp.B0q(Bsl2);
            if (B0q == null || B0q.A04 != C88Z.A0E) {
                return;
            }
            c8fg.A08("dial_element_selected");
            C8HJ c8hj = c8fg.A05;
            if (c8hj == null) {
                return;
            }
            c8hj.DA9(B0q);
        }
    }

    private final void A07(Object obj) {
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            c8fp.DEo();
            if (!(obj instanceof C187648Th)) {
                A0B(true);
                this.A0G.A06(0.0d);
            } else {
                A0B(false);
                C55982hj c55982hj = this.A0G;
                c55982hj.A08(0.0d, true);
                this.A0H.Dnk(c55982hj);
            }
            if (((obj instanceof C187608Td) && this.A0Q.A0H.B0f() != EnumC190378bv.A04) || (obj instanceof C187588Tb)) {
                this.A0N.CMh();
                A0A("exit_dial_picker_state");
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A08(String str) {
        EnumC150616qF enumC150616qF;
        String str2;
        this.A0I.A00.A00(new C9CJ(__redex_internal_original_name, "clearCurrentEffect"));
        this.A04 = null;
        AnonymousClass860 anonymousClass860 = this.A0Q;
        C1815383g c1815383g = anonymousClass860.A0C.A00;
        IgCameraEffectsController igCameraEffectsController = c1815383g.A05;
        CameraAREffect cameraAREffect = igCameraEffectsController.A09;
        if (cameraAREffect != null && "INSTAGRAM_CAMERA".equals(cameraAREffect.A0E)) {
            anonymousClass860.A0W.Egh(false);
            anonymousClass860.A0D.markerEnd(660604063, (short) 4);
        }
        boolean z = true;
        if (909729002 == str.hashCode() && str.equals("new_effect_selected")) {
            z = false;
        }
        CameraAREffect cameraAREffect2 = igCameraEffectsController.A09;
        if (cameraAREffect2 != null && (str2 = cameraAREffect2.A0K) != null) {
            c1815383g.A03.FDQ(str2, str);
        }
        CameraAREffect cameraAREffect3 = igCameraEffectsController.A09;
        InterfaceC149836oc interfaceC149836oc = igCameraEffectsController.A0L;
        if (interfaceC149836oc != null && cameraAREffect3 != null) {
            interfaceC149836oc.EoY(cameraAREffect3.A0K);
        }
        CameraAREffect cameraAREffect4 = igCameraEffectsController.A09;
        Iterator it = igCameraEffectsController.A0R.iterator();
        while (it.hasNext()) {
            ((C83N) it.next()).DD7(null, cameraAREffect4);
        }
        igCameraEffectsController.A09 = null;
        igCameraEffectsController.A0A = null;
        Map map = igCameraEffectsController.A0H.A00;
        map.clear();
        map.putAll(AbstractC06930Yk.A0E());
        if (z) {
            enumC150616qF = EnumC150616qF.USER_INTERACTION;
        } else {
            enumC150616qF = EnumC150616qF.SYSTEM;
        }
        IgCameraEffectsController.A01(enumC150616qF, igCameraEffectsController, "clearCurrentEffect", true, false);
        boolean equals = str.equals("new_effect_selected");
        if (!equals) {
            AnonymousClass858 anonymousClass858 = anonymousClass860.A05;
            if (anonymousClass858.A00.getValue() instanceof C189118Zc) {
                anonymousClass860.A0B.A05.Egh(AnonymousClass863.A00);
                anonymousClass858.A01(C85B.A06);
            }
        }
        C8HJ c8hj = this.A05;
        if (c8hj != null) {
            c8hj.Dl0(true);
            if (!equals) {
                c8hj.CuD(cameraAREffect, null);
            }
        }
    }

    private final void A09(String str) {
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            if (c8fp.B10() == 1) {
                A01();
            } else {
                int B0x = c8fp.B0x(str);
                if (c8fp.EFH(B0x)) {
                    if (B0x >= c8fp.B10()) {
                        B0x--;
                    }
                    if (!c8fp.CaY(B0x)) {
                        String format = String.format(Locale.US, "removeEffect() invalid newIndex=%d size =%d", Arrays.copyOf(new Object[]{Integer.valueOf(B0x), Integer.valueOf(c8fp.B10())}, 2));
                        C14360o3.A07(format);
                        AbstractC12120kG.A07(__redex_internal_original_name, format, null);
                    }
                    C88X B0q = c8fp.B0q(B0x);
                    if (B0q != null && B0q.A04 == C88Z.A04) {
                        String id = B0q.getId();
                        C14360o3.A07(id);
                        A05(this, new C189118Zc(C85B.A06, id, AbstractC203558zG.A00(this.A0Q.A0P.A00), null, null, null, null, -1, false), true);
                        c8fp.ETk(B0q.A0G);
                        C8HJ c8hj = this.A05;
                        if (c8hj != null) {
                            c8hj.DA9(B0q);
                        }
                    }
                }
            }
            AnonymousClass860 anonymousClass860 = this.A0Q;
            CameraAREffect cameraAREffect = anonymousClass860.A0C.A00.A05.A09;
            if (cameraAREffect != null && C14360o3.A0K(cameraAREffect.A0K, str)) {
                A08("remove_effect_user_request");
            }
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50120MBu(anonymousClass860, str, null, 38), AbstractC141776au.A00(anonymousClass860));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A0A(String str) {
        if (this.A0Q.A0H.Bv8()) {
            A01();
        } else {
            C8FP c8fp = this.A0O;
            if (c8fp != null) {
                c8fp.EGG();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A08(str);
    }

    private final void A0B(boolean z) {
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            c8fp.EPh(z);
            this.A07 = z;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A0C(C8FG c8fg) {
        C1810981l c1810981l = c8fg.A0L;
        if (!c1810981l.A0W(C81W.A0C) && !(c1810981l.A08.A00 instanceof C81R)) {
            return true;
        }
        return false;
    }

    public final C88X A0D() {
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            return c8fp.AuN();
        }
        return null;
    }

    public final void A0E() {
        this.A0D.removeCallbacks(this.A0T);
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            if (!c8fp.isEmpty() && A0C(this)) {
                A0A("camera_enter_hidden");
            }
            this.A0Y.A02.A00.clear();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0G(String str) {
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            c8fp.CoD();
            if (str != null) {
                C189118Zc c189118Zc = new C189118Zc(C85B.A06, str, "live_camera", null, null, null, null, -1, false);
                AnonymousClass858 anonymousClass858 = this.A0Q.A05;
                if (!anonymousClass858.A02(c189118Zc.A02)) {
                    anonymousClass858.A00.Egh(c189118Zc);
                }
                c8fp.EMq(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0H(boolean z) {
        C88X c88x;
        boolean z2;
        C88Z c88z;
        C8FP c8fp = this.A0O;
        if (c8fp != null) {
            c88x = c8fp.Bb7();
        } else {
            c88x = null;
        }
        if (c88x != null && ((c88z = c88x.A04) == C88Z.A0G || c88z == C88Z.A0E)) {
            z2 = false;
        } else {
            z2 = true;
            if (this.A0Q.A0H.Bv8()) {
                A01();
                return;
            }
        }
        if (A0C(this) && z2 && c8fp != null) {
            C88X c88x2 = C88X.A0T;
            C14360o3.A08(c88x2);
            c8fp.EMP(Math.max(c8fp.B0w(c88x2), 0), z);
        }
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        if (obj == EnumC1810181d.A11) {
            return A0C(this);
        }
        throw new UnsupportedOperationException("Unexpected filtered state");
    }

    @Override // X.C8FH
    public final void AVq(C88X c88x, Map map) {
        C8HJ c8hj = this.A05;
        if (c8hj != null) {
            c8hj.DA5(c88x, map);
        }
    }

    @Override // X.C8FH
    public final int BMv() {
        return this.A00;
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        C88X c88x = (C88X) interfaceC120325cX;
        C14360o3.A0B(c88x, 0);
        C8HJ c8hj = this.A05;
        if (c8hj != null) {
            c8hj.DA9(c88x);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == X.EnumC1810181d.A0G) goto L24;
     */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FG.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0U;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        A04(this);
    }

    @Override // X.InterfaceC149856oe
    public final void DD6(boolean z, String str) {
        AnonymousClass883 A00;
        A06(this, z);
        AnonymousClass880 anonymousClass880 = this.A0M;
        if (anonymousClass880 != null && (A00 = anonymousClass880.A00()) != null) {
            A00.ECs();
        }
    }

    public C8FG(Activity activity, View view, C07X c07x, C2GT c2gt, C55952hg c55952hg, AnonymousClass845 anonymousClass845, C85Z c85z, UserSession userSession, C1810981l c1810981l, final AnonymousClass880 anonymousClass880, C1821185v c1821185v, C1824987o c1824987o, final AnonymousClass860 anonymousClass860, C87Q c87q, InterfaceC1810081c interfaceC1810081c, AnonymousClass825 anonymousClass825, String str, boolean z) {
        InterfaceC08830cm interfaceC08830cm;
        C8FP c8fo;
        C14360o3.A0B(interfaceC1810081c, 1);
        C14360o3.A0B(c1810981l, 2);
        C14360o3.A0B(c2gt, 3);
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(anonymousClass860, 10);
        C14360o3.A0B(str, 12);
        C14360o3.A0B(anonymousClass825, 13);
        C14360o3.A0B(c07x, 17);
        this.A0R = interfaceC1810081c;
        this.A0L = c1810981l;
        this.A0F = c2gt;
        this.A0E = view;
        this.A0N = c1821185v;
        this.A0K = userSession;
        this.A0Z = c1824987o;
        this.A0M = anonymousClass880;
        this.A0C = activity;
        this.A0Q = anonymousClass860;
        this.A0W = z;
        this.A0U = str;
        this.A0S = anonymousClass825;
        this.A0J = c85z;
        this.A0I = anonymousClass845;
        this.A0A = new HashSet();
        this.A0V = new HashSet();
        interfaceC1810081c.A82(this);
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0P = c85z == null ? null : new C8FK(this);
        C8FL c8fl = new C8FL(userSession, this, c87q);
        this.A0Y = c8fl;
        C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A01;
        String str2 = anonymousClass860.A0R;
        if (anonymousClass880 != null) {
            final C01A c01a = new C01A(anonymousClass880) { // from class: X.8FM
                @Override // X.InterfaceC016806n
                public final Object get() {
                    return ((AnonymousClass880) this.receiver).A00();
                }
            };
            interfaceC08830cm = new InterfaceC08830cm() { // from class: X.8FN
                @Override // X.InterfaceC08830cm
                public final /* synthetic */ Object get() {
                    return InterfaceC16820sZ.this.invoke();
                }
            };
        } else {
            interfaceC08830cm = null;
        }
        C14360o3.A0B(c1810281e, 2);
        if (!"pre_capture".equals(str2) && !"rtc_camera_together".equals(str2)) {
            c8fo = new OyC(view, this, userSession, c8fl, this, null, c1810281e, str2, false, false);
        } else {
            Context context = view.getContext();
            C14360o3.A07(context);
            if (interfaceC08830cm != null) {
                c8fo = new C8FO(context, this, userSession, c1810981l, c8fl, this, str2, interfaceC08830cm);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        final C8FP c8fp = c8fo;
        this.A0O = c8fp;
        c8fl.A00 = c8fp;
        A0B(true);
        C55982hj A02 = c55952hg.A02();
        A02.A06 = true;
        this.A0G = A02;
        InterfaceC55932he Bp9 = c8fp.Bp9();
        this.A0H = Bp9;
        A02.A0A(Bp9);
        this.A0X = new C1824487j();
        this.A0T = new Runnable() { // from class: X.8FZ
            @Override // java.lang.Runnable
            public final void run() {
                C8FG c8fg = this;
                C88X c88x = c8fg.A01;
                if (c88x != null) {
                    int i = (c8fg.A0Q.A0H.Bv5() ? 1 : 0) + c8fg.A00;
                    C8FP c8fp2 = c8fp;
                    String id = c88x.getId();
                    C14360o3.A07(id);
                    int B0x = c8fp2.B0x(id);
                    if (B0x >= 0) {
                        if (c8fp2.Bsl() == B0x) {
                            c8fp2.EGG();
                        }
                        c8fp2.EMs(null, B0x, false);
                    } else {
                        if (c8fg.A0L.A08.A00 instanceof C81V) {
                            i = c8fp2.B10();
                            int i2 = i - 1;
                            C88X B0q = c8fp2.B0q(i2);
                            if (B0q != null) {
                                C88Z c88z = B0q.A04;
                                if (c88z == null) {
                                    c88z = C88Z.A0G;
                                }
                                if (c88z == C88Z.A0E) {
                                    i = i2;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        c8fp2.A8M(c88x, i);
                        c8fp2.EMs(null, i, false);
                    }
                    CameraAREffect A00 = c88x.A00();
                    if (A00 != null) {
                        c8fp2.ETk(A00.A0S);
                    }
                    c8fg.A01 = null;
                    c8fg.A04 = null;
                    c8fp2.notifyDataSetChanged();
                }
            }
        };
        Context context2 = view.getContext();
        C14360o3.A07(context2);
        if (C6PX.A00(context2)) {
            C007802s A022 = AnonymousClass111.A02(new C9DF(anonymousClass860, (InterfaceC23621Ds) null, 2), new C15340po(new C9D0(anonymousClass860, null, 18), C0ST.A01(C0JE.A00(new MCK(anonymousClass860.A0G, (InterfaceC23621Ds) null, 49, 42)))));
            InterfaceC19390xP ARK = anonymousClass860.A0H.ARK(c1810281e);
            AnonymousClass858 anonymousClass858 = anonymousClass860.A05;
            final C05A c05a = anonymousClass858.A01;
            final InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP() { // from class: X.8Fd
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = c05a.collect(new EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            final InterfaceC19390xP interfaceC19390xP2 = new InterfaceC19390xP() { // from class: X.8Fe
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            final InterfaceC19390xP interfaceC19390xP3 = new InterfaceC19390xP() { // from class: X.8Ff
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = interfaceC19390xP2.collect(new EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            InterfaceC19390xP interfaceC19390xP4 = new InterfaceC19390xP() { // from class: X.8Fg
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = interfaceC19390xP3.collect(new EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            final C05A c05a2 = anonymousClass858.A00;
            final InterfaceC19390xP interfaceC19390xP5 = new InterfaceC19390xP() { // from class: X.8Fh
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            final C013404z A04 = AnonymousClass111.A04(ARK, interfaceC19390xP4, C0ST.A01(new InterfaceC19390xP() { // from class: X.8Fi
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            }));
            final InterfaceC19390xP interfaceC19390xP6 = new InterfaceC19390xP() { // from class: X.8Fj
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = A04.collect(new EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            InterfaceC19390xP A01 = C0ST.A01(new InterfaceC19390xP() { // from class: X.8Fk
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = interfaceC19390xP6.collect(new EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            });
            final C05U A03 = AbstractC07080Za.A03(anonymousClass860.A0V);
            final InterfaceC19390xP interfaceC19390xP7 = new InterfaceC19390xP() { // from class: X.8Fl
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = A03.collect(new EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            InterfaceC19390xP interfaceC19390xP8 = new InterfaceC19390xP() { // from class: X.8Fm
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = interfaceC19390xP7.collect(new EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            };
            final C05A c05a3 = anonymousClass860.A0X;
            final AnonymousClass058 anonymousClass058 = new AnonymousClass058(new C0V6(null, new EffectTrayViewModel$getTray$3(null), new InterfaceC19390xP[]{AnonymousClass111.A04(A022, AnonymousClass111.A02(new C9DF(anonymousClass860, (InterfaceC23621Ds) null, 4), AnonymousClass111.A04(A01, interfaceC19390xP8, new InterfaceC19390xP() { // from class: X.8Fn
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = c05a3.collect(new EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            }))), anonymousClass860.A0e}));
            InterfaceC19390xP A012 = C0ST.A01(new InterfaceC19390xP() { // from class: X.8Fp
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = anonymousClass058.collect(new EffectTrayViewModel$getTray$$inlined$filterNot$1$2(anonymousClass860, interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            });
            final InterfaceC19390xP A00 = AbstractC184118Fa.A00(c1810281e);
            final CoroutineLiveData A002 = AbstractC58232lf.A00(AnonymousClass191.A00, new C15340po(new C9D0(anonymousClass860, null, 19), AnonymousClass111.A02(new C9DF((InterfaceC23621Ds) null, A012, 1), AbstractC208910l.A01(EnumC1810181d.A0V, AbstractC141776au.A00(anonymousClass860), new InterfaceC19390xP() { // from class: X.8Fq
                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    Object collect = InterfaceC19390xP.this.collect(new EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                    if (collect != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return collect;
                }
            }, C10I.A01))));
            final C58252li c58252li = new C58252li();
            InterfaceC58362lv interfaceC58362lv = new InterfaceC58362lv() { // from class: X.8Fr
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    Object A023 = C2GT.this.A02();
                    Boolean bool = (Boolean) this.A0F.A02();
                    if (A023 != null && bool != null && bool.booleanValue()) {
                        c58252li.A0B(A023);
                    }
                }
            };
            c58252li.A0E(c2gt, interfaceC58362lv);
            c58252li.A0E(A002, interfaceC58362lv);
            c58252li.A06(c07x, new C184288Fs(new C9EB(this, 31)));
        }
        anonymousClass860.A0K.A06(c07x, new C184288Fs(new C9EB(this, 32)));
        anonymousClass860.A0L.A06(c07x, new C184288Fs(new C9EB(this, 33)));
        anonymousClass860.A02.A06(c07x, new C184288Fs(new C9EB(this, 34)));
        C86K c86k = anonymousClass860.A0J;
        C14360o3.A0C(c86k, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Unit>");
        c86k.A06(c07x, new C184288Fs(new C9EB(this, 35)));
        C86K c86k2 = anonymousClass860.A0N;
        C14360o3.A0C(c86k2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>");
        c86k2.A06(c07x, new C184288Fs(new C9EB(this, 36)));
        C86K c86k3 = anonymousClass860.A0M;
        C14360o3.A0C(c86k3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>");
        c86k3.A06(c07x, new C184288Fs(new C9EB(this, 37)));
        final C15340po c15340po = new C15340po(new C9D0(anonymousClass860, null, 20), anonymousClass860.A05.A00);
        InterfaceC19390xP interfaceC19390xP9 = new InterfaceC19390xP() { // from class: X.8Fu
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP9).A06(c07x, new C184288Fs(new C9EB(this, 38)));
        if (C18U.A06(C06090Tz.A06, userSession, 36327533469317790L)) {
            c1810981l.A0G(new C23637AdW(this));
        }
        AbstractC58232lf.A00(anonymousClass191, anonymousClass860.A0e).A06(c07x, new C184288Fs(new C9EB(this, 27)));
        anonymousClass860.A01().A06(c07x, new C184288Fs(new C9EB(this, 28)));
        AbstractC58232lf.A00(anonymousClass191, anonymousClass860.A0c).A06(c07x, new C184288Fs(new C9EB(this, 29)));
        AbstractC58232lf.A00(anonymousClass191, new C15340po(new C9D0(anonymousClass860, null, 16), C0JE.A00(new C9D3(anonymousClass860.A0C, null, 16)))).A06(c07x, new C184288Fs(new C9EB(this, 30)));
        anonymousClass845.A00.A00(new C9CJ(__redex_internal_original_name, "dialPickerInitialized"));
    }
}
