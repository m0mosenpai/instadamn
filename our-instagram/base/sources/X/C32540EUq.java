package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EUq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32540EUq extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C32540EUq(AbstractC12990ll abstractC12990ll, InterfaceC37298Gbz interfaceC37298Gbz, FRE fre, int i) {
        this.A00 = i;
        this.A01 = fre;
        if (10 - i != 0) {
            this.A02 = interfaceC37298Gbz;
            this.A03 = abstractC12990ll;
        } else {
            this.A03 = abstractC12990ll;
            this.A02 = interfaceC37298Gbz;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A032;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(-580285828);
                ((InterfaceC37191Ga2) this.A02).DgQ((EnumC222416a) this.A03);
                i2 = 1435427067;
                C0f9.A0A(i2, A032);
                return;
            case 1:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -988280994);
                String A04 = AbstractC151876sX.A04(abstractC115105If, ((Context) this.A01).getString(2131975081));
                C14360o3.A07(A04);
                String A02 = AbstractC151876sX.A02(abstractC115105If);
                C14360o3.A07(A02);
                String A01 = AbstractC151876sX.A01(abstractC115105If);
                if (A01 == null) {
                    A01 = "NO_INTERNET";
                }
                ((CategorySearchFragment) this.A02).Dfs(A04, A02, A01);
                i2 = -471671885;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A032 = C0f9.A03(-1095890925);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C0w9.A07("Failed to get RN checkpoint", A012);
                }
                G06 g06 = (G06) this.A01;
                g06.A02 = false;
                G06.A00((Context) this.A03, g06, (FNM) this.A02);
                i2 = -1726561043;
                C0f9.A0A(i2, A032);
                return;
            case 3:
                A032 = C0f9.A03(-266099969);
                ((C34670FPf) this.A01).A00();
                C9GR.A07(((C684436h) this.A03).A00, 2131961880);
                i2 = -1613540527;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = C0f9.A03(-1017713577);
                C9GR.A0F((Context) this.A01, "view_on_facebook_failed", 2131976864);
                i2 = -1372901010;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A032 = C0f9.A03(1651583805);
                ((IgdsButton) this.A01).setLoading(false);
                EN6 en6 = (EN6) this.A03;
                C9GR.A07(en6.getActivity(), 2131960763);
                C47910LEe c47910LEe = (C47910LEe) en6.A04.getValue();
                c47910LEe.A00.markerPoint(31786177, "Follow_Creator_Failed");
                C47910LEe.A00(c47910LEe, (short) 3);
                AbstractC31179DnN.A0x(en6);
                i2 = 1697031849;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 320050559);
                C31340Dq5 c31340Dq5 = (C31340Dq5) this.A03;
                UserSession userSession = c31340Dq5.A03;
                InterfaceC11380iw interfaceC11380iw = c31340Dq5.A02;
                String id = ((PendingRecipient) this.A02).getId();
                String str2 = ((C84923qg) this.A01).A0G;
                InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                if (A0L != null) {
                    str = A0L.getErrorMessage();
                } else {
                    str = null;
                }
                C162337Ov.A0S(interfaceC11380iw, userSession, "open_thread_error", id, str2, AnonymousClass001.A0R("Failed to load post link.", str));
                i2 = -1416806700;
                C0f9.A0A(i2, A032);
                return;
            case 7:
                A03 = C0f9.A03(-1440011092);
                C32356ENd c32356ENd = (C32356ENd) this.A03;
                EQM eqm = c32356ENd.A03;
                if (eqm == null) {
                    C14360o3.A0F("userListAdapter");
                    throw C00O.createAndThrow();
                }
                eqm.A0C = false;
                eqm.A04 = new GHR(c32356ENd, (User) this.A02, (List) this.A01);
                eqm.A0A = true;
                eqm.A03();
                i = -1169925256;
                C0f9.A0A(i, A03);
                return;
            case 8:
            default:
                super.onFail(abstractC115105If);
                return;
            case 9:
                A032 = C0f9.A03(1141841683);
                ((C33629Etf) this.A03).A00();
                C9GR.A0A(AbstractC31172DnG.A07(this.A01), "onLocationDetailDirectMessage onFail");
                i2 = 176865984;
                C0f9.A0A(i2, A032);
                return;
            case 10:
                A03 = C0f9.A03(821533504);
                i = -1664182344;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A032 = C0f9.A03(2047631485);
                ((FRE) this.A01).A00 = AbstractC166987dD.A1E();
                i2 = 1576379460;
                C0f9.A0A(i2, A032);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A032 = C0f9.A03(-491876750);
                ((InterfaceC16620sF) this.A02).invoke(AbstractC166997dE.A0a(), null);
                i2 = 1442206537;
                C0f9.A0A(i2, A032);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(1507559810);
                C9GR.A04(((C36674GEu) this.A03).A00);
                AbstractC31171DnF.A1N(this.A01);
                i2 = 747668466;
                C0f9.A0A(i2, A032);
                return;
            case 14:
                A032 = C0f9.A03(-1551140058);
                InterfaceC37186GZx interfaceC37186GZx = ((C32259EIt) this.A03).A01;
                if (interfaceC37186GZx != null) {
                    interfaceC37186GZx.DFf();
                }
                IgdsSwitch igdsSwitch = (IgdsSwitch) this.A02;
                if (igdsSwitch != null) {
                    igdsSwitch.A00();
                }
                i2 = 445629136;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGTERM /* 15 */:
                A032 = C0f9.A03(-744598206);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A02);
                C11T.A02(new GND((Context) this.A01));
                i2 = 712695108;
                C0f9.A0A(i2, A032);
                return;
            case 16:
                A032 = C0f9.A03(219099512);
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE);
                i2 = 863267828;
                C0f9.A0A(i2, A032);
                return;
            case 17:
                A032 = C0f9.A03(1597417045);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                GIS gis = (GIS) this.A03;
                Fragment fragment = gis.A02;
                A0K.A0D = AbstractC31178DnM.A0c(fragment.requireContext(), (User) this.A01, 2131974477);
                A0K.A0L = true;
                AbstractC31175DnJ.A0l(fragment.requireContext(), A0K, 2131975768);
                A0K.A06();
                G9A.A00(A0K, this.A02, gis, 15);
                A0K.A0J = true;
                A0K.A0R = true;
                AbstractC25233BEq.A1F(A0K);
                i2 = -1025452094;
                C0f9.A0A(i2, A032);
                return;
            case 18:
                A032 = C0f9.A03(-1354440382);
                Toast A013 = C9GR.A01(AbstractC31172DnG.A06(this.A01), "delete_videos_failed", 2131957726, 0);
                if (A013 != null) {
                    A013.show();
                }
                i2 = -908190078;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(-2008561920);
                C9GR.A0F(AbstractC31172DnG.A06(this.A01), "remove_videos_from_highlight_failed", 2131972328);
                i2 = 1370781558;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-960267287);
                ((CategorySearchFragment) this.A02).Dfz();
                i = -1336131747;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(624592712);
                AbstractC31176DnK.A0y((Activity) this.A01, C56352iT.A0t);
                i = -1338419643;
                break;
            case 18:
                A03 = C0f9.A03(1107818257);
                ((C54809OKh) this.A02).A00();
                i = -886211930;
                break;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(927110328);
                ((C54809OKh) this.A02).A00();
                i = -2044335552;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(406808165);
                ((CategorySearchFragment) this.A02).DgF();
                i = -1934511278;
                break;
            case 9:
                A03 = C0f9.A03(1795612933);
                ((C33629Etf) this.A03).A01();
                i = -226099876;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(-1473274373);
                AbstractC31176DnK.A0z((Activity) this.A01, C56352iT.A0t);
                i = -1502608685;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(620419978);
                C0fJ.A00((Dialog) this.A01);
                i = 473702218;
                break;
            case 18:
                A03 = C0f9.A03(-1277957557);
                ((C54809OKh) this.A02).A01();
                i = -871187651;
                break;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(1389852342);
                ((C54809OKh) this.A02).A01();
                i = -486682638;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0606, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC166987dD.A0o(r9), 36318655771842941L) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x08af, code lost:
    
        if ("true".equals(r1.get("big_blue_token")) == false) goto L187;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.1vw, java.lang.Object, X.FvX] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, X.1vN, X.6xj] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32540EUq.onSuccess(java.lang.Object):void");
    }

    public C32540EUq(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
