package X;

import android.app.Activity;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.io.File;

/* renamed from: X.LXk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48261LXk implements InterfaceC11380iw, InterfaceC165807b7 {
    public static final String __redex_internal_original_name = "DirectThreadMediaSaver";
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC50435MOp A03;

    public final void A05(EnumC72433Xdd enumC72433Xdd, C38321qM c38321qM, EnumC40111tc enumC40111tc, String str, boolean z) {
        String str2;
        C7BW c7bw;
        AbstractC167017dG.A1N(c38321qM, enumC40111tc);
        C83403nh BSc = this.A03.BSc(str);
        if (BSc != null && (c7bw = BSc.A0Q) != null) {
            str2 = c7bw.A06;
        } else {
            str2 = null;
        }
        A03(this, new MEA(enumC72433Xdd, this, c38321qM, enumC40111tc, AbstractC46830KnP.A00(str2), z));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final C121275eQ A00(C48261LXk c48261LXk, C38321qM c38321qM, boolean z) {
        Activity activity = c48261LXk.A00;
        return AbstractC50633MWu.A04(activity, c48261LXk.A02, AbstractC50633MWu.A05(activity, c38321qM, __redex_internal_original_name, false, z), -1L, true);
    }

    public static final C121275eQ A01(C48261LXk c48261LXk, C7Q4 c7q4) {
        String A03;
        Activity activity = c48261LXk.A00;
        UserSession userSession = c48261LXk.A02;
        boolean A05 = c7q4.A05();
        if (A05) {
            A03 = c7q4.A04();
        } else {
            A03 = c7q4.A03();
        }
        return AbstractC50633MWu.A04(activity, userSession, new OUQ(A03, __redex_internal_original_name, A05, true, false), -1L, true);
    }

    public static final void A02(EnumC72433Xdd enumC72433Xdd, C48261LXk c48261LXk, InterfaceC50468MPw interfaceC50468MPw, String str) {
        C121275eQ A04;
        C38321qM c38321qM;
        C2EY Ar9 = interfaceC50468MPw.Ar9();
        AbstractC46822KnH abstractC46822KnH = AbstractC46822KnH.$redex_init_class;
        int ordinal = Ar9.ordinal();
        boolean z = false;
        String str2 = null;
        if (ordinal != 3 && ordinal != 52) {
            if (ordinal == 4) {
                if (interfaceC50468MPw instanceof LnZ) {
                    C83403nh c83403nh = ((LnZ) interfaceC50468MPw).A00;
                    C101584hT c101584hT = c83403nh.A0e;
                    if (c101584hT != null) {
                        c38321qM = c101584hT.A05;
                    } else {
                        c38321qM = null;
                    }
                    C7Q5 c7q5 = c83403nh.A0w;
                    if (c38321qM != null) {
                        A04 = A00(c48261LXk, c38321qM, false);
                    } else {
                        if (c7q5 == null) {
                            return;
                        }
                        if (!c7q5.A01() && c7q5.A04 == null) {
                            UserSession userSession = c48261LXk.A02;
                            C47Z A03 = C25A.A00(userSession).A03(c7q5.A03);
                            if (A03 == null) {
                                return;
                            }
                            A04 = AbstractC50633MWu.A01(c48261LXk.A00, userSession, C7Q5.A00(A03, c7q5.A06));
                        } else {
                            A04 = AbstractC50633MWu.A01(c48261LXk.A00, c48261LXk.A02, c7q5);
                        }
                    }
                } else {
                    return;
                }
            } else {
                throw AbstractC43594JPz.A0o(Ar9, "Invalid message contentType: ", AbstractC166987dD.A1C());
            }
        } else if (interfaceC50468MPw instanceof LnZ) {
            C83403nh c83403nh2 = ((LnZ) interfaceC50468MPw).A00;
            C38321qM c38321qM2 = c83403nh2.A0s;
            C7Q4 c7q4 = c83403nh2.A0v;
            C7BW c7bw = c83403nh2.A0Q;
            if (c7bw != null) {
                str2 = c7bw.A06;
            }
            str2 = AbstractC46830KnP.A00(str2);
            if (c38321qM2 != null) {
                A04 = A00(c48261LXk, c38321qM2, false);
            } else if (c7q4 == null) {
                return;
            } else {
                A04 = A01(c48261LXk, c7q4);
            }
        } else if (interfaceC50468MPw instanceof C49097Lna) {
            Activity activity = c48261LXk.A00;
            UserSession userSession2 = c48261LXk.A02;
            C49097Lna c49097Lna = (C49097Lna) interfaceC50468MPw;
            File A11 = AbstractC166987dD.A11(c49097Lna.A00.getPath());
            if (c49097Lna.A01 == EnumC40111tc.A0a) {
                z = true;
            }
            A04 = AbstractC50633MWu.A04(activity, userSession2, new OUQ(A11.getPath(), __redex_internal_original_name, 0, 0, z, true, false, false, false), -1L, true);
        } else {
            throw B4Z.A00();
        }
        A04.A00 = new C129505tF(enumC72433Xdd, c48261LXk, interfaceC50468MPw.BRp(), str, str2, interfaceC50468MPw instanceof C49097Lna);
        C1GJ.A03(A04);
    }

    public static final void A03(C48261LXk c48261LXk, InterfaceC16820sZ interfaceC16820sZ) {
        if (Build.VERSION.SDK_INT < 33) {
            Activity activity = c48261LXk.A00;
            if (!AbstractC23451Ch.A07(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                AbstractC43592JPx.A1C(activity, new C48291LYp(5, interfaceC16820sZ, c48261LXk), "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        interfaceC16820sZ.invoke();
    }

    public final void A04(EnumC72433Xdd enumC72433Xdd, InterfaceC50468MPw interfaceC50468MPw, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            Activity activity = this.A00;
            if (!AbstractC23451Ch.A07(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                AbstractC43592JPx.A1C(activity, new C48291LYp(5, new C57262Pbk(interfaceC50468MPw, this, str, 11), this), "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        A02(enumC72433Xdd, this, interfaceC50468MPw, str);
    }

    @Override // X.InterfaceC165807b7
    public final void ELm(MessageIdentifier messageIdentifier, String str) {
        C83403nh BSc = this.A03.BSc(messageIdentifier.A01);
        if (BSc != null) {
            C2EY c2ey = BSc.A10;
            C14360o3.A07(c2ey);
            A04(null, new LnZ(BSc, c2ey, BSc.A0W()), "message_menu");
        }
    }

    public C48261LXk(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50435MOp interfaceC50435MOp) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = interfaceC50435MOp;
        this.A01 = interfaceC11380iw;
    }
}
