package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3AE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AE extends AbstractC60592pi {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC65232xL A04;
    public final C57352kA A05;
    public final C1M1 A06;
    public final C25671My A07;
    public final InterfaceC61432r6 A0F;
    public final InterfaceC61432r6 A0G;
    public final C3AF A03 = new C3AF(this);
    public final InterfaceC41501vz A09 = new InterfaceC41501vz() { // from class: X.3AH
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            C3AE c3ae = C3AE.this;
            C72243Lx c72243Lx = (C72243Lx) obj;
            C38321qM c38321qM = c72243Lx.A01;
            Integer num = C05F.A01;
            SearchContext searchContext = new SearchContext();
            AnonymousClass341 anonymousClass341 = c72243Lx.A00;
            C3AG c3ag = c72243Lx.A02;
            if (c3ag == null) {
                c3ag = c3ae.A03;
            }
            C3AE.A00(c38321qM, c3ae, anonymousClass341, c3ag, searchContext, Boolean.valueOf(c72243Lx.A03), num, null);
        }
    };
    public final InterfaceC41501vz A0A = new InterfaceC41501vz() { // from class: X.3AI
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            C3AE c3ae = C3AE.this;
            C72233Lw c72233Lw = (C72233Lw) obj;
            C38321qM c38321qM = c72233Lw.A04;
            Integer num = C05F.A00;
            SearchContext searchContext = c72233Lw.A02;
            AnonymousClass341 anonymousClass341 = c72233Lw.A00;
            C3AG c3ag = c72233Lw.A01;
            if (c3ag == null) {
                c3ag = c3ae.A03;
            }
            C3AE.A00(c38321qM, c3ae, anonymousClass341, c3ag, searchContext, false, num, c72233Lw.A03);
        }
    };
    public final InterfaceC41501vz A0C = new InterfaceC41501vz() { // from class: X.3AJ
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            String str;
            C3AE c3ae = C3AE.this;
            C38321qM c38321qM = ((C3M2) obj).A00;
            C75113Zb BRZ = c3ae.A04.BRZ(c38321qM);
            if (BRZ != null) {
                C1M1 c1m1 = c3ae.A06;
                if (c1m1 != null) {
                    str = c1m1.getSessionId();
                } else {
                    str = null;
                }
                C41721Ids.A01(c3ae.A00, c3ae.A01, c38321qM, c3ae.A02, C05F.A00, String.valueOf(BRZ.getPosition()), String.valueOf(BRZ.A0W), str);
            }
        }
    };
    public final InterfaceC41501vz A0E = new InterfaceC41501vz() { // from class: X.3AK
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
        @Override // X.InterfaceC41501vz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C3AK.onEvent(java.lang.Object):void");
        }
    };
    public final InterfaceC41501vz A08 = new InterfaceC41501vz() { // from class: X.3AL
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            throw new NullPointerException("captionInteractionDelegate");
        }
    };
    public final InterfaceC41501vz A0B = new InterfaceC41501vz() { // from class: X.3AM
        /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            ImmutableList copyOf;
            ImageUrl imageUrl;
            List list;
            List list2;
            EnumC138476Pd enumC138476Pd;
            EffectInfoBottomSheetMode effectInfoBottomSheetMode;
            ProductAREffectContainer productAREffectContainer;
            C3AE c3ae = C3AE.this;
            C38321qM c38321qM = ((C3M0) obj).A00;
            CreativeConfigIntf Asm = c38321qM.A0C.Asm();
            Context context = c3ae.A00.getContext();
            if (context != null && Asm != null && Asm.B0S() != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Asm.B0S().iterator();
                String str = null;
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) it.next();
                    C14360o3.A0B(effectPreviewIntf, 0);
                    if (effectPreviewIntf.getId().length() == 0) {
                        C0w9.A03("EffectPreview", AbstractC43591JPw.A00(617));
                        C0w9.A03("MediaFeedbackHelper", AnonymousClass001.A0R("Receiving invalid config for effect: ", effectPreviewIntf.getName()));
                    } else {
                        if (!C6PX.A00(context)) {
                            str = context.getResources().getString(2131976219);
                        }
                        String id = effectPreviewIntf.getId();
                        String name = effectPreviewIntf.getName();
                        ImageUrl A00 = AbstractC41732Ie4.A00(effectPreviewIntf);
                        String A03 = AbstractC41732Ie4.A03(effectPreviewIntf);
                        ProductItemWithARIntf B0b = Asm.B0b();
                        if (B0b != null && B0b.BhA().BSW() != null) {
                            A03 = B0b.BhA().BSW().A03.getUsername();
                        }
                        String A02 = AbstractC41732Ie4.A02(effectPreviewIntf);
                        ProfilePicture Bhx = effectPreviewIntf.AdP().Bhx();
                        if (Bhx != null) {
                            imageUrl = Bhx.CDO();
                        } else {
                            imageUrl = null;
                        }
                        boolean equals = "SAVED".equals(effectPreviewIntf.getSaveStatus());
                        EffectActionSheetIntf B0O = effectPreviewIntf.B0O();
                        if (B0O == null || (list = B0O.BgC()) == null) {
                            list = C16930sl.A00;
                        }
                        EffectActionSheetIntf B0O2 = effectPreviewIntf.B0O();
                        if (B0O2 == null || (list2 = B0O2.BrM()) == null) {
                            list2 = C16930sl.A00;
                        }
                        AttributedAREffect attributedAREffect = new AttributedAREffect(A00, imageUrl, null, null, id, name, A03, A02, null, null, null, list, list2, null, 8, equals);
                        String A032 = AbstractC41732Ie4.A03(effectPreviewIntf);
                        ProductItemWithARIntf B0b2 = Asm.B0b();
                        if (B0b2 != null && B0b2.BhA().BSW() != null) {
                            A032 = B0b2.BhA().BSW().A03.getUsername();
                        }
                        EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(attributedAREffect, A032);
                        effectInfoAttributionConfiguration.A09 = str;
                        if (AbstractC121575f6.A0A(Asm)) {
                            enumC138476Pd = AbstractC121575f6.A03(Asm);
                        } else {
                            enumC138476Pd = null;
                        }
                        effectInfoAttributionConfiguration.A02 = enumC138476Pd;
                        if (Asm.B0b() != null) {
                            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
                        } else {
                            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
                        }
                        effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
                        if (Asm.B0b() != null) {
                            ProductItemWithAR F5w = Asm.B0b().F5w(C1DS.A00(c3ae.A01));
                            if (Asm.B0b().BhA() != null) {
                                z = false;
                            }
                            ?? obj2 = new Object();
                            obj2.A00 = F5w;
                            obj2.A01 = z;
                            productAREffectContainer = obj2;
                        } else {
                            productAREffectContainer = null;
                        }
                        effectInfoAttributionConfiguration.A05 = productAREffectContainer;
                        effectInfoAttributionConfiguration.A03 = AbstractC121575f6.A04(Asm);
                        arrayList.add(effectInfoAttributionConfiguration);
                    }
                }
                if (arrayList.isEmpty()) {
                    C0w9.A03("MediaFeedbackHelper", "Trying to launch bottom sheet with no effect info attribution configurations");
                    return;
                }
                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                if (arrayList.size() == 1) {
                    copyOf = ImmutableList.of(arrayList.get(0));
                } else if (!arrayList.isEmpty()) {
                    copyOf = ImmutableList.copyOf((Collection) arrayList);
                } else {
                    throw new IllegalArgumentException(AbstractC43591JPw.A00(774));
                }
                effectInfoBottomSheetConfiguration.A02 = copyOf;
                effectInfoBottomSheetConfiguration.A00 = 8;
                effectInfoBottomSheetConfiguration.A01 = C22P.A2l;
                effectInfoBottomSheetConfiguration.A06 = false;
                AbstractC55031OXo.A02(context, EnumC50631MWs.A0J, c3ae.A01, null, effectInfoBottomSheetConfiguration, new C29220CuP(c38321qM, c3ae), null);
            }
        }
    };
    public final InterfaceC41501vz A0D = new InterfaceC41501vz() { // from class: X.3AN
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            C54844OMp c54844OMp;
            C3AE c3ae = C3AE.this;
            C38321qM c38321qM = ((C3M1) obj).A00;
            Context requireContext = c3ae.A00.requireContext();
            if (c38321qM.A0C.CDj() != null && c38321qM.A0C.CDj().getId().equals(c3ae.A01.userId)) {
                c54844OMp = new C54844OMp(requireContext);
                c54844OMp.A06(requireContext.getString(2131971424));
                c54844OMp.A05(requireContext.getString(2131971427));
                c54844OMp.A06 = C05F.A0C;
                c54844OMp.A04(requireContext.getDrawable(R.drawable.ig_illustrations_illo_photo_grid_refresh));
                c54844OMp.A02(null, requireContext.getString(2131968948));
            } else {
                c54844OMp = new C54844OMp(requireContext);
                c54844OMp.A06(requireContext.getString(2131971424));
                c54844OMp.A05(requireContext.getString(2131971422));
                c54844OMp.A06 = C05F.A0C;
                c54844OMp.A04(requireContext.getDrawable(R.drawable.ig_illustrations_illo_photo_grid_refresh));
                c54844OMp.A02(new DialogInterfaceOnClickListenerC28536CiU(c3ae), requireContext.getString(2131971425));
                c54844OMp.A03(null, requireContext.getString(2131971423));
            }
            c54844OMp.A01();
        }
    };

    public static void A00(C38321qM c38321qM, C3AE c3ae, AnonymousClass341 anonymousClass341, C3AG c3ag, SearchContext searchContext, Boolean bool, Integer num, HashMap hashMap) {
        String A00;
        Long l;
        int i;
        Double d;
        ArrayList arrayList;
        String str;
        String str2;
        List AiQ;
        AnonymousClass341 anonymousClass3412 = AnonymousClass341.A07;
        if (anonymousClass341 == anonymousClass3412) {
            MVO A002 = AbstractC54029Nuf.A00(c3ae.A01);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new PZS(A002, null, 1), A002.A0N);
        }
        Integer num2 = C05F.A00;
        boolean z = false;
        boolean z2 = false;
        if (num == num2) {
            z2 = true;
        }
        c3ag.D26(c38321qM, z2);
        C75113Zb BRZ = c3ae.A04.BRZ(c38321qM);
        if (BRZ != null) {
            UserSession userSession = c3ae.A01;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36321537696736837L) && anonymousClass341 == anonymousClass3412 && c38321qM.CdW()) {
                z = true;
            }
            if (num == num2) {
                A00 = "caption_more_click";
            } else if (z) {
                A00 = "caption_dismiss";
            } else if (bool.booleanValue()) {
                A00 = "caption_less_scroll";
            } else {
                A00 = AbstractC111324zv.A00(787);
            }
            if (c38321qM.getId() != null) {
                l = C4q7.A01(c38321qM.getId());
            } else {
                l = null;
            }
            InterfaceC60442pS interfaceC60442pS = c3ae.A02;
            int i2 = BRZ.A03;
            if (BRZ.A0p()) {
                i = BRZ.getPosition();
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            Boolean bool2 = BRZ.A0y;
            if (l != null) {
                d = Double.valueOf(l.doubleValue());
            } else {
                d = null;
            }
            if (anonymousClass341 == anonymousClass3412 && c38321qM.CdW() && C18U.A06(c06090Tz, userSession, 36321537694901812L)) {
                arrayList = new ArrayList();
                if (c38321qM.A0C.AqQ() != null && (AiQ = c38321qM.A0C.AqQ().AiQ()) != null) {
                    Iterator it = AiQ.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC43502JJo) it.next()).CHH() == IGConsiderAndBrowseType.A06) {
                            arrayList.add(AbstractC111324zv.A00(2028));
                            break;
                        }
                    }
                }
            }
            arrayList = null;
            C1M1 c1m1 = c3ae.A06;
            if (c1m1 instanceof InterfaceC43589JPu) {
                str = ((InterfaceC43589JPu) c1m1).Amq();
            } else {
                str = null;
            }
            if (c1m1 != null) {
                str2 = c1m1.getSessionId();
            } else {
                str2 = null;
            }
            C32U.A0P(userSession, c38321qM, interfaceC60442pS, searchContext, null, bool2, d, valueOf, null, A00, str, str2, arrayList, hashMap, i2);
            if (num == num2) {
                InterfaceC61432r6 interfaceC61432r6 = c3ae.A0F;
                if (interfaceC61432r6 != null) {
                    C14360o3.A0B(userSession, 0);
                    if (C18U.A06(c06090Tz, userSession, 36319209823542319L)) {
                        C120985dq A04 = C120985dq.A0d.A04(c38321qM);
                        interfaceC61432r6.DVi(C6T5.A00(), AnonymousClass317.A06, A04, AbstractC37652Ghl.A01(A04, userSession, C3YS.A00(userSession), null, null));
                        C689838k A003 = AbstractC689738j.A00(userSession);
                        if (!AbstractC81213jq.A00(c38321qM, BRZ.A02) && !A003.A02(c38321qM, BRZ)) {
                            if (C18U.A06(C06090Tz.A05, A003.A00, 2342159057941434273L)) {
                                AbstractC123605iZ.A00(userSession);
                                C123625ib.A00(userSession, c38321qM, interfaceC60442pS, BRZ);
                                BRZ.A0m(true, true);
                                return;
                            }
                            return;
                        }
                    }
                }
                InterfaceC61432r6 interfaceC61432r62 = c3ae.A0G;
                if (interfaceC61432r62 != null) {
                    interfaceC61432r62.DVi(C6T5.A00(), AnonymousClass317.A06, c38321qM, BRZ);
                }
                C689838k A0032 = AbstractC689738j.A00(userSession);
                if (!AbstractC81213jq.A00(c38321qM, BRZ.A02)) {
                }
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C25671My c25671My = this.A07;
        c25671My.A02(this.A0A, C72233Lw.class);
        c25671My.A02(this.A09, C72243Lx.class);
        InterfaceC41501vz interfaceC41501vz = this.A08;
        c25671My.A02(interfaceC41501vz, AbstractC72253Ly.class);
        c25671My.A02(this.A0E, C72263Lz.class);
        c25671My.A02(interfaceC41501vz, AbstractC72253Ly.class);
        c25671My.A02(this.A0B, C3M0.class);
        c25671My.A02(this.A0D, C3M1.class);
        c25671My.A02(this.A0C, C3M2.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C25671My c25671My = this.A07;
        c25671My.A01(this.A0A, C72233Lw.class);
        c25671My.A01(this.A09, C72243Lx.class);
        InterfaceC41501vz interfaceC41501vz = this.A08;
        c25671My.A01(interfaceC41501vz, AbstractC72253Ly.class);
        c25671My.A01(this.A0E, C72263Lz.class);
        c25671My.A01(interfaceC41501vz, AbstractC72253Ly.class);
        c25671My.A01(this.A0B, C3M0.class);
        c25671My.A01(this.A0D, C3M1.class);
        c25671My.A01(this.A0C, C3M2.class);
    }

    public C3AE(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65232xL interfaceC65232xL, C57352kA c57352kA, InterfaceC61432r6 interfaceC61432r6, InterfaceC61432r6 interfaceC61432r62, C1M1 c1m1) {
        this.A01 = userSession;
        this.A07 = AbstractC25651Mw.A00(userSession);
        this.A04 = interfaceC65232xL;
        this.A00 = fragment;
        this.A02 = interfaceC60442pS;
        this.A05 = c57352kA;
        this.A06 = c1m1;
        this.A0G = interfaceC61432r6;
        this.A0F = interfaceC61432r62;
    }
}
