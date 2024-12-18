package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OIx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54783OIx {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC70363Du A02;
    public final InterfaceC57966PnC A03;

    public C54783OIx(OXD oxd) {
        C14360o3.A0B(oxd, 1);
        this.A00 = oxd.A0A;
        this.A02 = oxd.A0D;
        this.A01 = oxd.A0B;
        this.A03 = oxd.A0F;
    }

    public final void A00(C38321qM c38321qM, C47Z c47z, boolean z) {
        String str;
        String str2;
        C14360o3.A0B(c47z, 0);
        String str3 = null;
        if (c47z.A11()) {
            String str4 = c47z.A3V;
            if (str4 != null) {
                File parentFile = AbstractC166987dD.A11(str4).getParentFile();
                if (parentFile != null) {
                    if (!MSX.A1Y(parentFile, C1Q3.A01)) {
                        String str5 = c47z.A3V;
                        if (str5 != null) {
                            if (AbstractC002300n.A0f(str5, "mp4", false)) {
                                str2 = "video/mp4";
                            } else {
                                str2 = "video/x-matroska";
                            }
                            AbstractC54108Nw6.A00(this.A00, str5, str2);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            if (c47z.A3V != null && c38321qM != null && !AbstractC50707Ma2.A03(c47z) && ((str = Build.MANUFACTURER) == null || (!str.equalsIgnoreCase("nokia")))) {
                c38321qM.A0M = c47z.A3V;
            }
            boolean A14 = c47z.A14(ShareType.A02);
            boolean A00 = AbstractC50707Ma2.A00(c47z);
            UserSession userSession = this.A01;
            if (AbstractC54247NyS.A00(userSession, A14, A00) && c47z.A4w) {
                this.A03.ELv(this.A00, userSession, c47z);
            }
            File A07 = AbstractC916948n.A07();
            String str6 = c47z.A1N.A0F;
            if (str6 != null) {
                File parentFile2 = AbstractC166987dD.A11(str6).getParentFile();
                if (parentFile2 != null) {
                    if (A07.equals(parentFile2)) {
                        AbstractC13530mf.A09(str6);
                    }
                    List list = c47z.A4a;
                    if (list != null && AbstractC166987dD.A1b(list)) {
                        List list2 = c47z.A4a;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                String str7 = ((C5NJ) it.next()).A05;
                                if (str7 != null) {
                                    AbstractC13530mf.A09(str7);
                                }
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    String str8 = c47z.A3V;
                    if (z && str8 != null) {
                        File parentFile3 = AbstractC166987dD.A11(str8).getParentFile();
                        if (parentFile3 != null) {
                            if (MSX.A1Y(parentFile3, C1Q3.A01)) {
                                AbstractC13530mf.A09(str8);
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (c47z.A1G == EnumC40111tc.A07) {
            C52W c52w = c47z.A1L;
            if (c52w != null) {
                str3 = c52w.A01;
            }
            if (z && str3 != null) {
                AbstractC13530mf.A09(str3);
                return;
            }
            return;
        }
        boolean A142 = c47z.A14(ShareType.A02);
        boolean A002 = AbstractC50707Ma2.A00(c47z);
        UserSession userSession2 = this.A01;
        if (AbstractC54247NyS.A00(userSession2, A142, A002) && c47z.A4w && !c47z.A57) {
            Context context = this.A00;
            try {
                File file = (File) new PUR(context, userSession2, AbstractC50633MWu.A07(new C105814ps(c47z), "ConfigureTool"), 0, 0, -1L, true).call();
                if (file != null && file.exists()) {
                    AbstractC50633MWu.A09(context, file);
                }
            } catch (Exception e) {
                C0w9.A06("ConfigureTool#savePhotoToGallery", AnonymousClass001.A0R("id: ", c47z.A3t), e);
            }
        }
        String str9 = c47z.A33;
        if (str9 != null) {
            if (!z && !AbstractC31171DnF.A1b(c47z.A4t) && !c47z.A5q) {
                if (c38321qM == null) {
                    C0w9.A03("ConfigureTool media is null", AnonymousClass001.A0R("id: ", c47z.A3t));
                } else {
                    c38321qM.A05 = AbstractC167007dF.A0I(str9);
                }
            } else {
                AbstractC13530mf.A09(str9);
            }
            if (!AbstractC23021Ah.A00(userSession2).A1x()) {
                MSW.A0w(AbstractC166987dD.A11(C50472Tr.A01()), "temp.jpg").delete();
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
