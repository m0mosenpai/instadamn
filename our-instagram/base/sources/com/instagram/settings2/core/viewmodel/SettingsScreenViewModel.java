package com.instagram.settings2.core.viewmodel;

import X.AbstractC07080Za;
import X.AbstractC09440dt;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC43594JPz;
import X.AbstractC52922bZ;
import X.AnonymousClass001;
import X.AnonymousClass058;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.B4Z;
import X.C006802i;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0Hg;
import X.C0K8;
import X.C0UO;
import X.C10I;
import X.C12L;
import X.C141796aw;
import X.C14360o3;
import X.C16930sl;
import X.C19K;
import X.C2C;
import X.C35132FeZ;
import X.C43171J6q;
import X.C43205J8c;
import X.C45119Jxo;
import X.C47979LIr;
import X.C51749MtY;
import X.C51759Mti;
import X.C51918Mx0;
import X.C51926Mx9;
import X.C51927MxA;
import X.C54824OLi;
import X.C57166PZk;
import X.C57252Pba;
import X.C71533It;
import X.D3Z;
import X.EnumC53216NgE;
import X.EnumC72365Xc1;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.InterfaceC37110GWv;
import X.InterfaceC57989PnZ;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MSZ;
import X.MUG;
import X.MWT;
import X.Mx8;
import X.NVU;
import X.NVV;
import X.NVW;
import X.NVX;
import X.NVY;
import X.NVZ;
import X.O5W;
import X.O5Y;
import X.OMF;
import X.PZC;
import X.PZL;
import X.PZW;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class SettingsScreenViewModel extends AbstractC52922bZ {
    public MWT A00;
    public InterfaceC37110GWv A01;
    public List A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public final C51749MtY A05;
    public final UserSession A06;
    public final SettingsRepository A07;
    public final SettingsSession A08;
    public final O5Y A09;
    public final EnumC72365Xc1 A0A;
    public final C47979LIr A0B;
    public final String A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC24731Iq A0F;
    public final InterfaceC24731Iq A0G;
    public final InterfaceC19390xP A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C0UO A0K;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[LOOP:0: B:18:0x004a->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AbstractC55145Od4 r9, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 7
            boolean r0 = X.C57146PWy.A01(r11, r3)
            if (r0 == 0) goto L77
            r7 = r11
            X.PWy r7 = (X.C57146PWy) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r8 = r7.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r1 = 1
            r5 = 2
            if (r0 == 0) goto L29
            if (r0 == r1) goto L39
            if (r0 != r5) goto L7d
            X.AbstractC09560e7.A00(r8)
        L26:
            X.0eB r6 = X.C0eB.A00
            return r6
        L29:
            X.AbstractC09560e7.A00(r8)
            com.instagram.settings2.core.session.SettingsSession r0 = r10.A08
            r7.A01 = r10
            r7.A00 = r1
            java.lang.Object r8 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r9, r0, r7)
            if (r8 != r6) goto L40
            return r6
        L39:
            java.lang.Object r10 = r7.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r10 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r10
            X.AbstractC09560e7.A00(r8)
        L40:
            X.GWv r8 = (X.InterfaceC37110GWv) r8
            r10.A01 = r8
            java.util.List r0 = r10.A02
            java.util.Iterator r4 = r0.iterator()
        L4a:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L65
            java.lang.Object r2 = r4.next()
            X.195 r2 = (X.AnonymousClass195) r2
            java.lang.String r1 = "Navigating to another screen"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r3)
            r2.AGH(r0)
            goto L4a
        L65:
            X.1Iq r1 = r10.A0F
            X.E9e r0 = new X.E9e
            r0.<init>(r8, r3)
            r7.A01 = r3
            r7.A00 = r5
            java.lang.Object r0 = r1.EMz(r0, r7)
            if (r0 != r6) goto L26
            return r6
        L77:
            X.PWy r7 = new X.PWy
            r7.<init>(r10, r11, r3)
            goto L15
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A01(X.Od4, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.1Ds):java.lang.Object");
    }

    public final void A06(O5W o5w) {
        C141796aw A00;
        int i;
        String str;
        C14360o3.A0B(o5w, 0);
        MWT mwt = this.A00;
        if (mwt != null) {
            C54824OLi c54824OLi = (C54824OLi) this.A0D.getValue();
            InterfaceC57989PnZ interfaceC57989PnZ = (InterfaceC57989PnZ) mwt.A02;
            EnumC53216NgE enumC53216NgE = (EnumC53216NgE) mwt.A01;
            String str2 = o5w.A00;
            String str3 = mwt.A03;
            AbstractC167007dF.A1D(interfaceC57989PnZ, 0, enumC53216NgE);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(interfaceC57989PnZ.BOw());
            A1C.append("_modal_");
            A1C.append(str2);
            A1C.append('_');
            A1C.append("dialog");
            A1C.append('_');
            A1C.append(enumC53216NgE.A00);
            if (str3 == null || (str = AnonymousClass001.A0D(str3, '_')) == null) {
                str = "";
            }
            c54824OLi.A01(AbstractC166997dE.A0x(String.valueOf(str), A1C), C05F.A15, this.A0C);
        } else {
            C0K8.A0C("SettingsScreenViewModel", "onModalButtonTapped(): Active modal should not be null");
        }
        if (o5w instanceof NVV) {
            A00 = AbstractC141776au.A00(this);
            i = 44;
        } else if (o5w instanceof NVU) {
            A00 = AbstractC141776au.A00(this);
            i = 43;
        } else {
            if (o5w instanceof NVW) {
                AbstractC166987dD.A1Z(new PZL(o5w, this, null, 41), AbstractC141776au.A00(this));
            } else if (!(o5w instanceof NVX)) {
                if (o5w instanceof NVZ) {
                    MWT mwt2 = this.A00;
                    if (mwt2 != null && mwt2.A00 != null && mwt2.A05 != null) {
                        AbstractC166987dD.A1Z(new PZL(mwt2, this, null, 42), AbstractC141776au.A00(this));
                    }
                } else if (o5w instanceof NVY) {
                    MWT mwt3 = this.A00;
                    if (mwt3 != null && mwt3.A00 != null && mwt3.A05 != null) {
                        A00 = AbstractC141776au.A00(this);
                        i = 45;
                    }
                } else {
                    throw B4Z.A00();
                }
                C0K8.A0C("SettingsScreenViewModel", "No active modal, or the active modal doesn't have the correct data. Something is wrong!");
                return;
            }
            this.A00 = null;
        }
        PZC.A02(this, A00, i);
        this.A00 = null;
    }

    public final void A09(EnumC72365Xc1 enumC72365Xc1, String str, boolean z) {
        short s;
        C14360o3.A0B(enumC72365Xc1, 0);
        OMF omf = (OMF) this.A0E.getValue();
        int hashCode = enumC72365Xc1.hashCode();
        C006802i c006802i = omf.A00;
        if (z) {
            s = 2;
        } else {
            c006802i.markerAnnotate(827064321, hashCode, "error_message", str);
            s = 3;
        }
        c006802i.markerEnd(827064321, hashCode, s);
    }

    public final void A0A(EnumC72365Xc1 enumC72365Xc1, boolean z) {
        C14360o3.A0B(enumC72365Xc1, 0);
        OMF omf = (OMF) this.A0E.getValue();
        int hashCode = enumC72365Xc1.hashCode();
        C006802i c006802i = omf.A00;
        c006802i.markerStart(827064321, hashCode);
        c006802i.markerAnnotate(827064321, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, enumC72365Xc1.name());
        c006802i.markerAnnotate(827064321, hashCode, "is_initial_load", z);
    }

    public /* synthetic */ SettingsScreenViewModel(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC72365Xc1 enumC72365Xc1, String str, boolean z) {
        C47979LIr c47979LIr = (C47979LIr) C47979LIr.A0A.getValue();
        O5Y o5y = new O5Y(userSession);
        AbstractC167007dF.A1D(userSession, 1, interfaceC11380iw);
        AbstractC167007dF.A1F(enumC72365Xc1, 3, c47979LIr);
        this.A06 = userSession;
        this.A0A = enumC72365Xc1;
        this.A0B = c47979LIr;
        this.A0C = str;
        this.A09 = o5y;
        if (z) {
            C35132FeZ.A00(userSession).A00 = null;
        }
        SettingsSession settingsSession = C35132FeZ.A00(this.A06).A00;
        if (settingsSession == null) {
            C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(480314591, 3).plus(D3Z.A00));
            UserSession userSession2 = this.A06;
            settingsSession = new SettingsSession(userSession2, new SettingsRepository(userSession2, this.A0B, this.A0C, A02), this.A0C, A02);
            C35132FeZ.A00(this.A06).A00 = settingsSession;
        }
        this.A08 = settingsSession;
        SettingsRepository settingsRepository = settingsSession.A01;
        this.A07 = settingsRepository;
        C51749MtY c51749MtY = (C51749MtY) MSZ.A0l(enumC72365Xc1, c47979LIr.A02);
        if (c51749MtY != null) {
            this.A05 = c51749MtY;
            C008002u A1H = AbstractC25225BEi.A1H("");
            this.A0J = A1H;
            C008002u A1A = AbstractC25235BEs.A1A(false);
            this.A0I = A1A;
            this.A04 = true;
            Integer num = C05F.A01;
            C71533It c71533It = new C71533It(1, num);
            this.A0F = c71533It;
            this.A0H = AbstractC07080Za.A03(c71533It);
            C71533It c71533It2 = new C71533It(1, num);
            this.A0G = c71533It2;
            C16930sl c16930sl = C16930sl.A00;
            this.A02 = c16930sl;
            this.A0D = AbstractC09440dt.A01(new C57252Pba(31, interfaceC11380iw, this));
            this.A0E = AbstractC09440dt.A01(new C43205J8c(this, 9));
            AnonymousClass058 anonymousClass058 = new AnonymousClass058(new C0Hg(new SettingsScreenViewModel$uiState$1(this, null), new InterfaceC19390xP[]{A1H, A1A, settingsRepository.A0L, settingsSession.A08, AbstractC07080Za.A03(c71533It2)}, (InterfaceC23621Ds) null, 1));
            this.A0K = AbstractC208910l.A01(new C45119Jxo(C51759Mti.A01(""), new C2C(c16930sl, true), enumC72365Xc1, c16930sl), AbstractC141776au.A00(this), anonymousClass058, C10I.A01);
            return;
        }
        throw AbstractC37303Gc4.A0M(enumC72365Xc1, "No screen model found for ID ", AbstractC166987dD.A1C());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(4:(1:(1:(1:(2:13|14))(4:16|17|18|19))(3:20|21|22))|34|18|19)(2:35|(3:37|(2:39|(1:41)(1:42))|(7:44|(1:46)(1:48)|47|31|(1:27)|18|19)(3:49|50|(2:52|53)))(2:56|57))|23|24|25|(0)|18|19))|59|6|7|(0)(0)|23|24|25|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.EnumC53216NgE r17, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r18, X.InterfaceC57989PnZ r19, java.lang.Object r20, java.lang.String r21, java.lang.String r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A00(X.NgE, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.PnZ, java.lang.Object, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(2:58|(3:(2:66|67)(1:(1:63)(2:64|65))|20|21)(2:68|69))(4:8|9|10|(2:12|(2:14|15))(2:55|56))|17|18|(3:22|23|(5:42|43|44|45|(2:47|48))(3:25|26|(2:28|29)(4:30|31|32|(2:34|35))))|20|21))|71|6|(0)(0)|17|18|(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
    
        r5 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: Exception -> 0x00b9, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b9, blocks: (B:18:0x006d, B:22:0x0071), top: B:17:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r15, X.InterfaceC57989PnZ r16, X.InterfaceC23621Ds r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A02(com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.PnZ, X.1Ds):java.lang.Object");
    }

    public final Object A03(C51749MtY c51749MtY, EnumC53216NgE enumC53216NgE, O5W o5w, InterfaceC57989PnZ interfaceC57989PnZ, Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC24731Iq interfaceC24731Iq;
        Object mx8;
        this.A00 = new MWT(enumC53216NgE, interfaceC57989PnZ, obj, obj2, str);
        List list = (List) c51749MtY.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj3 : list) {
            if (((MUG) obj3).A01) {
                A1E.add(obj3);
            }
        }
        if (A1E.isEmpty() || (A1E.size() == 1 && ((MUG) A1E.get(0)).A03 == null)) {
            Number number = (Number) c51749MtY.A02;
            C51759Mti c51759Mti = null;
            if (!A1E.isEmpty()) {
                c51759Mti = (C51759Mti) ((MUG) A1E.get(0)).A00;
            }
            C51759Mti c51759Mti2 = (C51759Mti) c51749MtY.A01;
            if (c51759Mti2 == null) {
                c51759Mti2 = new C51759Mti(new C51918Mx0(2131954754));
            }
            C51759Mti c51759Mti3 = new C51759Mti(c51759Mti2, o5w);
            interfaceC24731Iq = this.A0F;
            C51759Mti c51759Mti4 = (C51759Mti) c51749MtY.A05;
            if (number != null) {
                int intValue = number.intValue();
                C51759Mti c51759Mti5 = (C51759Mti) c51749MtY.A03;
                C51759Mti c51759Mti6 = (C51759Mti) c51749MtY.A04;
                if (c51759Mti6 == null) {
                    c51759Mti6 = c51759Mti3;
                }
                mx8 = new C51927MxA(c51759Mti4, c51759Mti, c51759Mti5, c51759Mti6, intValue);
            } else {
                C51759Mti c51759Mti7 = (C51759Mti) c51749MtY.A03;
                C51759Mti c51759Mti8 = (C51759Mti) c51749MtY.A04;
                if (c51759Mti8 != null) {
                    c51759Mti3 = c51759Mti8;
                }
                mx8 = new Mx8(c51759Mti4, c51759Mti, c51759Mti7, c51759Mti3);
            }
        } else {
            interfaceC24731Iq = this.A0F;
            mx8 = new C51926Mx9((C51759Mti) c51749MtY.A05, (C51759Mti) c51749MtY.A03, (C51759Mti) c51749MtY.A04, o5w, A1E);
        }
        return MSX.A0b(interfaceC24731Iq.EMz(mx8, interfaceC23621Ds));
    }

    public final void A04() {
        AbstractC43594JPz.A1T(this.A0I);
    }

    public final void A05() {
        boolean z = this.A04;
        if (this.A02.isEmpty()) {
            SettingsRepository settingsRepository = this.A07;
            List A1Q = AbstractC16960so.A1Q(MSW.A1I(new C57166PZk(this, null, 14), settingsRepository.A0Q), MSW.A1I(new PZL((InterfaceC23621Ds) null, this, 44), settingsRepository.A0O), MSW.A1I(new PZL((InterfaceC23621Ds) null, this, 45), settingsRepository.A0N), MSW.A1I(new PZL((InterfaceC23621Ds) null, this, 46), settingsRepository.A0P), MSW.A1I(new PZL((InterfaceC23621Ds) null, this, 47), settingsRepository.A0U), MSW.A1I(new C43171J6q(this, null, 27), settingsRepository.A0T), MSW.A1I(new PZC(this, null, 48), settingsRepository.A0R), MSW.A1I(new PZL((InterfaceC23621Ds) null, this, 48), settingsRepository.A0S));
            ArrayList A0q = AbstractC167017dG.A0q(A1Q);
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                A0q.add(MSY.A0q(this, (InterfaceC19390xP) it.next()));
            }
            this.A02 = A0q;
        }
        PZW.A01(this, AbstractC141776au.A00(this), 49, z);
    }

    public final void A0B(boolean z) {
        String str;
        String str2;
        MWT mwt = this.A00;
        if (mwt != null) {
            C54824OLi c54824OLi = (C54824OLi) this.A0D.getValue();
            InterfaceC57989PnZ interfaceC57989PnZ = (InterfaceC57989PnZ) mwt.A02;
            EnumC53216NgE enumC53216NgE = (EnumC53216NgE) mwt.A01;
            String str3 = mwt.A03;
            AbstractC167017dG.A1O(interfaceC57989PnZ, enumC53216NgE);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(interfaceC57989PnZ.BOw());
            A1C.append("_modal_");
            if (z) {
                str = "bottomsheet";
            } else {
                str = "dialog";
            }
            A1C.append(str);
            A1C.append('_');
            A1C.append(enumC53216NgE.A00);
            if (str3 == null || (str2 = AnonymousClass001.A0D(str3, '_')) == null) {
                str2 = "";
            }
            c54824OLi.A00(null, C05F.A0u, AbstractC166997dE.A0x(str2, A1C), null, null, this.A0C);
            return;
        }
        C0K8.A0C("SettingsScreenViewModel", "onModalImpression(): Active modal should not be null");
    }

    public final void A07(EnumC72365Xc1 enumC72365Xc1, String str) {
        AbstractC167017dG.A1N(enumC72365Xc1, str);
        OMF omf = (OMF) this.A0E.getValue();
        omf.A00.markerPoint(827064321, enumC72365Xc1.hashCode(), "section_load_begin", str);
    }

    public final void A08(EnumC72365Xc1 enumC72365Xc1, String str) {
        AbstractC167017dG.A1N(enumC72365Xc1, str);
        OMF omf = (OMF) this.A0E.getValue();
        omf.A00.markerPoint(827064321, enumC72365Xc1.hashCode(), "section_load_end", str);
    }
}
