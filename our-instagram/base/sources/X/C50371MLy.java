package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.MLy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50371MLy extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public static C166007bS A00(Object obj, C50371MLy c50371MLy) {
        C14360o3.A0B(obj, 0);
        C166007bS c166007bS = ((C25814BbV) c50371MLy.A02).A0C;
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        return c166007bS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50371MLy(C25814BbV c25814BbV, User user, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = c25814BbV;
        this.A01 = user;
        switch (i) {
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 21:
                this.A03 = str;
                this.A04 = str2;
                break;
            case 20:
            default:
                this.A04 = str;
                this.A03 = str2;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ImmutableList immutableList;
        ImmutableList parseStringDefList;
        EnumC61204Rh4 enumC61204Rh4;
        R1X A0E;
        R0H A0E2;
        R1N A0E3;
        String str;
        QWW A0E4;
        QWW A0E5;
        String A0B;
        QWW A0E6;
        C166007bS A00;
        String A06;
        User user;
        String str2;
        String str3;
        String str4;
        Object value;
        C50627MWo c50627MWo;
        ArrayList A0q;
        Object value2;
        C50627MWo c50627MWo2;
        ArrayList A0q2;
        C25531Mh c25531Mh;
        C0Zx c0Zx;
        LoggingContext loggingContext;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        switch (this.A00) {
            case 0:
            case 2:
                immutableList = (ImmutableList) obj;
                C14360o3.A0B(immutableList, 0);
                parseStringDefList = ((C2JS) this.A02).parseStringDefList(immutableList, this.A03, this.A04, (FromStringAble) this.A01);
                return parseStringDefList;
            case 1:
                immutableList = (ImmutableList) obj;
                if (immutableList == null) {
                    return null;
                }
                parseStringDefList = ((C2JS) this.A02).parseStringDefList(immutableList, this.A03, this.A04, (FromStringAble) this.A01);
                return parseStringDefList;
            case 3:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                str5 = this.A03;
                str6 = "fulfillment_option_id";
                c0Zx.A06(str6, str5);
                str7 = this.A04;
                str8 = "target_name";
                c0Zx.A06(str8, str7);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 4:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                str5 = this.A03;
                str6 = "shipping_option_id";
                c0Zx.A06(str6, str5);
                str7 = this.A04;
                str8 = "target_name";
                c0Zx.A06(str8, str7);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 5:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                c0Zx.A06("auto_advance_from_field", this.A03);
                c0Zx.A06("auto_advance_to_field", this.A04);
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 6:
            case 7:
            case 8:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                str9 = this.A03;
                str10 = "fulfillment_option_id";
                c0Zx.A06(str10, str9);
                str7 = this.A04;
                str8 = "view_name";
                c0Zx.A06(str8, str7);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 9:
            case 10:
            case 11:
            default:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                str9 = this.A03;
                str10 = "shipping_option_id";
                c0Zx.A06(str10, str9);
                str7 = this.A04;
                str8 = "view_name";
                c0Zx.A06(str8, str7);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                boolean A1a = AbstractC166987dD.A1a(obj);
                Wap A0H = AbstractC43592JPx.A0H();
                UFX ufx = (UFX) this.A02;
                LoggingContext loggingContext2 = ufx.A1P;
                String str11 = this.A04;
                Long l = (Long) this.A01;
                C70073W1q A05 = ufx.A1Q.A05();
                String str12 = this.A03;
                LinkedHashMap A0n = JQ0.A0n(A05, A1a);
                if (str12 != null) {
                    A0n.put("selected_shippingaddress_state", str12);
                }
                A0H.A0K(loggingContext2, l, str11, A0n);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                int i = 0;
                C14360o3.A0B(c63406Sjd, 0);
                if (!C63406Sjd.A0I(c63406Sjd)) {
                    R0L r0l = (R0L) c63406Sjd.A01;
                    C70073W1q c70073W1q = null;
                    if (r0l != null && (A0E = r0l.A0E()) != null && (A0E2 = A0E.A0E()) != null && (A0E3 = A0E2.A0E()) != null) {
                        EnumC61204Rh4 enumC61204Rh42 = EnumC61204Rh4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        enumC61204Rh4 = (EnumC61204Rh4) A0E3.getOptionalEnumField(1, "error_step", enumC61204Rh42);
                        if (enumC61204Rh4 != null && enumC61204Rh4 != enumC61204Rh42) {
                            Throwable th = c63406Sjd.A02;
                            if (th == null) {
                                R0O A0F = A0E3.A0F();
                                if (A0F != null && (A0E6 = A0F.A0E()) != null) {
                                    i = A0E6.getCoercedIntField(0, TraceFieldType.ErrorCode);
                                }
                                String str13 = "Unknown Server Error For Credential Mutation";
                                R0O A0F2 = A0E3.A0F();
                                if (A0F2 != null && (A0E5 = A0F2.A0E()) != null && (A0B = A0E5.A0B(AbstractC58317Pt9.A00(24))) != null && !AbstractC001900j.A0T(A0B)) {
                                    str13 = A0B;
                                }
                                R0O A0F3 = A0E3.A0F();
                                if (A0F3 == null || (A0E4 = A0F3.A0E()) == null || (str = A0E4.A0C(AbstractC58317Pt9.A00(22))) == null) {
                                    str = "";
                                }
                                th = S23.A00(str13, str, i);
                            }
                            c63406Sjd = C63406Sjd.A05(null, th);
                            C14360o3.A0A(c63406Sjd);
                        }
                    } else {
                        enumC61204Rh4 = null;
                    }
                    C70199WGm c70199WGm = AbstractC62321S6r.A00;
                    LoggingContext loggingContext3 = (LoggingContext) this.A01;
                    String str14 = this.A04;
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A06(AbstractC58317Pt9.A00(867), AbstractC58317Pt9.A00(261));
                    Locale locale = Locale.US;
                    C14360o3.A08(locale);
                    c0Zx2.A01(RiI.valueOf(AbstractC166997dE.A10(locale, str14)), "mutation_type");
                    List A1J = AbstractC166987dD.A1J(c0Zx2);
                    String str15 = this.A03;
                    OtcInput otcInput = (OtcInput) this.A02;
                    if (otcInput != null) {
                        c70073W1q = AbstractC63060Sbh.A01(otcInput);
                    }
                    c70199WGm.A0D(enumC61204Rh4, loggingContext3, c70073W1q, c63406Sjd, str14, str15, A1J, true);
                }
                return C63406Sjd.A00(LRP.A00, c63406Sjd);
            case 14:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                return AbstractC166327c1.A07(c166137bh, this.A04, this.A03, new C50369MLw(26, this.A02, this.A01));
            case Process.SIGTERM /* 15 */:
                C166137bh c166137bh2 = (C166137bh) obj;
                C14360o3.A0B(c166137bh2, 0);
                return AbstractC166327c1.A06(c166137bh2, this.A04, this.A03, new C50369MLw(27, this.A02, this.A01));
            case 16:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A02;
                AbstractC166987dD.A1Z(new JZ1(abstractC52922bZ, this.A01, this.A03, this.A04, null, 2), AbstractC141776au.A00(abstractC52922bZ));
                return C0eB.A00;
            case 17:
                C166047bW c166047bW = (C166047bW) obj;
                C166007bS A002 = A00(c166047bW, this);
                String A062 = C38801rC.A06(c166047bW.A0I);
                User user2 = (User) this.A01;
                String str16 = this.A03;
                String str17 = this.A04;
                AbstractC167027dH.A13(A062, user2, str16);
                C75R.A00.A0H(A002.A01, user2, "impression", "restrict_success_dialog", str16, str17, A062, null);
                return C0eB.A00;
            case 18:
                C166047bW c166047bW2 = (C166047bW) obj;
                A00 = A00(c166047bW2, this);
                A06 = C38801rC.A06(c166047bW2.A0I);
                user = (User) this.A01;
                str2 = this.A03;
                str3 = this.A04;
                str4 = "restrict_success_delete_comment";
                A00.A0A(user, str4, A06, str2, str3);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C166047bW c166047bW3 = (C166047bW) obj;
                A00 = A00(c166047bW3, this);
                A06 = C38801rC.A06(c166047bW3.A0I);
                user = (User) this.A01;
                str2 = this.A03;
                str3 = this.A04;
                str4 = "restrict_success_dialog";
                A00.A0A(user, str4, A06, str2, str3);
                return C0eB.A00;
            case 20:
                C166047bW c166047bW4 = (C166047bW) obj;
                A00 = A00(c166047bW4, this);
                A06 = C38801rC.A06(c166047bW4.A0I);
                user = (User) this.A01;
                str2 = this.A04;
                str3 = this.A03;
                str4 = "restrict_option";
                A00.A0A(user, str4, A06, str2, str3);
                return C0eB.A00;
            case 21:
                C166047bW c166047bW5 = (C166047bW) obj;
                A00(c166047bW5, this).A09((User) this.A01, C38801rC.A06(c166047bW5.A0I), this.A03, this.A04);
                return C0eB.A00;
            case 22:
                EnumC185338Jz enumC185338Jz = (EnumC185338Jz) obj;
                if (enumC185338Jz == EnumC185338Jz.A05) {
                    C8JT c8jt = (C8JT) this.A02;
                    MusicAttributionConfig musicAttributionConfig = (MusicAttributionConfig) c8jt.A1p.A02.getValue();
                    if (musicAttributionConfig != null) {
                        String str18 = this.A04;
                        String str19 = this.A03;
                        InstagramAudioApplySource instagramAudioApplySource = (InstagramAudioApplySource) this.A01;
                        AnonymousClass826 anonymousClass826 = c8jt.A0I;
                        if (anonymousClass826 != null) {
                            AudioOverlayTrack A003 = C9NX.A00(musicAttributionConfig, anonymousClass826.A01);
                            if (A003 != null) {
                                A003.A0C = str19;
                                A003.A07 = instagramAudioApplySource;
                                C8JT.A11(c8jt, A003, true);
                            }
                            AnonymousClass229.A01(c8jt.A1D).A1i(musicAttributionConfig.A02, "SUCCESS", str18);
                        }
                    }
                } else if (enumC185338Jz == EnumC185338Jz.A02 || enumC185338Jz == EnumC185338Jz.A04) {
                    AnonymousClass229.A01(((C8JT) this.A02).A1D).A1i(null, enumC185338Jz.name(), this.A04);
                }
                return C0eB.A00;
            case 23:
                C26004Bes c26004Bes = (C26004Bes) obj;
                C14360o3.A0B(c26004Bes, 0);
                AbstractC166987dD.A1Y(this.A02);
                int i2 = c26004Bes.A00;
                if (i2 == 0) {
                    L66 l66 = (L66) this.A01;
                    String str20 = this.A03;
                    String str21 = this.A04;
                    AbstractC167007dF.A1K(str20, str21);
                    KBD kbd = l66.A00;
                    C44454JlM c44454JlM = (C44454JlM) kbd.A01.getValue();
                    FragmentActivity requireActivity = kbd.requireActivity();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString(MSV.A00(943), str21);
                    A0b.putBoolean(MSV.A00(82), false);
                    N52 n52 = new N52();
                    n52.setArguments(A0b);
                    n52.A00 = new LXE(c44454JlM, str20);
                    UserSession userSession = c44454JlM.A01;
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                    EnumC60792q3 enumC60792q3 = EnumC60792q3.A02;
                    C14360o3.A0B(enumC60792q3, 0);
                    A0y.A0O = enumC60792q3;
                    AbstractC31173DnH.A0w(requireActivity, n52, A0y);
                    AnonymousClass229.A01(userSession).A1q(str20);
                } else if (i2 == 3) {
                    ((L66) this.A01).A00(this.A03);
                } else if (i2 == 1) {
                    L66 l662 = (L66) this.A01;
                    String str22 = this.A03;
                    C14360o3.A0B(str22, 0);
                    C05A c05a = ((C44454JlM) l662.A00.A01.getValue()).A05;
                    do {
                        value2 = c05a.getValue();
                        c50627MWo2 = (C50627MWo) value2;
                        List<C45057Jwm> list = (List) ((C50627MWo) c05a.getValue()).A01;
                        A0q2 = AbstractC167017dG.A0q(list);
                        for (C45057Jwm c45057Jwm : list) {
                            String str23 = c45057Jwm.A02;
                            if (C14360o3.A0K(str23, str22)) {
                                String str24 = c45057Jwm.A05;
                                String str25 = c45057Jwm.A04;
                                String str26 = c45057Jwm.A01;
                                C7U c7u = c45057Jwm.A00;
                                boolean z = c45057Jwm.A06;
                                String str27 = c45057Jwm.A03;
                                C14360o3.A0B(str23, 0);
                                AbstractC167007dF.A1D(str24, 1, str25);
                                AbstractC167007dF.A1F(str26, 3, c7u);
                                c45057Jwm = new C45057Jwm(c7u, str23, str24, str25, str26, str27, z, true);
                            }
                            A0q2.add(c45057Jwm);
                        }
                    } while (!c05a.AIi(value2, C50627MWo.A00((C7U) c50627MWo2.A00, AbstractC133095zb.A03(A0q2))));
                } else if (i2 == 2) {
                    L66 l663 = (L66) this.A01;
                    String str28 = this.A03;
                    C14360o3.A0B(str28, 0);
                    C05A c05a2 = ((C44454JlM) l663.A00.A01.getValue()).A05;
                    do {
                        value = c05a2.getValue();
                        c50627MWo = (C50627MWo) value;
                        List<C45057Jwm> list2 = (List) ((C50627MWo) c05a2.getValue()).A01;
                        A0q = AbstractC167017dG.A0q(list2);
                        for (C45057Jwm c45057Jwm2 : list2) {
                            String str29 = c45057Jwm2.A02;
                            if (C14360o3.A0K(str29, str28)) {
                                String str30 = c45057Jwm2.A05;
                                String str31 = c45057Jwm2.A04;
                                String str32 = c45057Jwm2.A01;
                                C7U c7u2 = c45057Jwm2.A00;
                                boolean z2 = c45057Jwm2.A06;
                                String str33 = c45057Jwm2.A03;
                                AbstractC167007dF.A1K(str29, str30);
                                C14360o3.A0B(str31, 2);
                                AbstractC167007dF.A1F(str32, 3, c7u2);
                                c45057Jwm2 = new C45057Jwm(c7u2, str29, str30, str31, str32, str33, z2, false);
                            }
                            A0q.add(c45057Jwm2);
                        }
                    } while (!c05a2.AIi(value, C50627MWo.A00((C7U) c50627MWo.A00, AbstractC133095zb.A03(A0q))));
                }
                return C0eB.A00;
            case 24:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list3 = (List) this.A01;
                MJN mjn = MJN.A00;
                AbstractC25227BEk.A15(A0T, new C30721DfJ(this.A03, this.A04, list3, (InterfaceC16660sJ) this.A02), new C30183DRo(7, list3, (InterfaceC16660sJ) mjn), new C30183DRo(8, list3, (InterfaceC16660sJ) MJO.A00), list3.size());
                return C0eB.A00;
            case 25:
                C26865BtR c26865BtR = (C26865BtR) this.A02;
                C26865BtR.A00(c26865BtR, this.A03);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c26865BtR.A03);
                String str34 = this.A04;
                Bundle bundle = (Bundle) this.A01;
                bundle.putSerializable("creator_ai_fragment_dismiss_strategy", C63.A02);
                bundle.putString(AbstractC111324zv.A00(2206), "sandbox");
                new C6XJ(c26865BtR.getActivity(), bundle, A0o, ModalActivity.class, str34).A0C(c26865BtR.getActivity());
                InterfaceC16820sZ interfaceC16820sZ = c26865BtR.A00;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                return C0eB.A00;
            case 26:
                C09530e4 c09530e4 = (C09530e4) obj;
                C14360o3.A0B(c09530e4, 0);
                Object obj2 = c09530e4.A00;
                Number number = (Number) c09530e4.A01;
                if (obj2 == null && number != null) {
                    AbstractC44195Jfy.A00(((C47661L2u) this.A02).A00).A02(this.A03, number.intValue());
                }
                ((C47661L2u) this.A02).A03.A00(this.A04, null, 7042, AbstractC31177DnL.A03(number));
                AbstractC25225BEi.A1U(this.A01, obj2);
                return C0eB.A00;
            case 27:
                C09530e4 c09530e42 = (C09530e4) obj;
                C14360o3.A0B(c09530e42, 0);
                Object obj3 = c09530e42.A00;
                int A0K = AbstractC167017dG.A0K((Number) c09530e42.A01);
                if (obj3 == null) {
                    C47911LEf c47911LEf = (C47911LEf) this.A02;
                    AbstractC44195Jfy.A00(c47911LEf.A00).A02(this.A03, A0K);
                    c47911LEf.A03.A00(this.A04, AbstractC43594JPz.A10(A0K), 7042, 0);
                }
                ((InterfaceC16660sJ) this.A01).invoke(AbstractC166987dD.A1L(obj3, String.valueOf(A0K)));
                return C0eB.A00;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                L34 l34 = (L34) obj;
                C14360o3.A0B(l34, 0);
                l34.A01 = this.A04;
                l34.A02 = (Integer) this.A02;
                l34.A00 = this.A03;
                l34.A03 = (InterfaceC16820sZ) this.A01;
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50371MLy(Object obj, Object obj2, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj2;
    }
}
