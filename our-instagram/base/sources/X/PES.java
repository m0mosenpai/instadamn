package X;

import android.content.Context;
import com.facebook.common.util.TriState;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.instagram.arp.api.AvatarEffectsApiController;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class PES implements InterfaceC58155PqK {
    public final /* synthetic */ AbstractC54988OTw A00;

    @Override // X.InterfaceC58155PqK
    public final void D1J(C19L c19l) {
        boolean z;
        long j;
        C14360o3.A0B(c19l, 0);
        AbstractC54988OTw abstractC54988OTw = this.A00;
        abstractC54988OTw.A01 = c19l;
        if (abstractC54988OTw instanceof NU3) {
            NU3 nu3 = (NU3) abstractC54988OTw;
            if (nu3.A0H) {
                NU3.A01(nu3, nu3.A0E);
                nu3.A00 = null;
                nu3.A04 = false;
                return;
            }
            return;
        }
        if (abstractC54988OTw instanceof NU5) {
            NU5 nu5 = (NU5) abstractC54988OTw;
            nu5.A0P.A02.clear();
            C54803OJx c54803OJx = nu5.A0L;
            c54803OJx.A08 = c19l;
            nu5.A0O.A01 = c19l;
            if (!nu5.A0B) {
                C54823OLg c54823OLg = c54803OJx.A0A;
                if (c54823OLg.A00() instanceof NUJ) {
                    if (C18U.A06(C06090Tz.A05, c54823OLg.A00, 2342153903982117241L) && c54803OJx.A0D.A00.A00.getInt("rtc_avatar_effect_compatibility_version", 0) != 2) {
                        z = false;
                        j = 0;
                    } else {
                        z = true;
                        j = 86400000;
                    }
                    PZI.A01(c54803OJx, c19l, c54803OJx.A00(C191258dU.A0A, j, z, !z), 43);
                }
                PZI.A01(c54803OJx, c19l, c54803OJx.A00(C191258dU.A0D, 86400000L, true, false), 44);
                PZI.A01(c54803OJx, c19l, c54803OJx.A00(C191258dU.A0F, 86400000L, true, false), 45);
                OHG ohg = c54803OJx.A0C;
                if (ohg.A00()) {
                    PZI.A01(c54803OJx, c19l, c54803OJx.A00(C191258dU.A0E, 86400000L, true, false), 46);
                }
                if (C18U.A06(C06090Tz.A05, ohg.A00, 36317092403745575L)) {
                    PZI.A01(c54803OJx, c19l, c54803OJx.A00(C191258dU.A0G, 86400000L, true, false), 47);
                }
                nu5.A0B = true;
            }
            if (!nu5.A0M.A00.A00.getBoolean("rtc_should_auto_apply_touch_up", false)) {
                return;
            }
            NU5.A0G(nu5, C05F.A1I, true);
            return;
        }
        if (abstractC54988OTw instanceof C52711NTw) {
            C52711NTw c52711NTw = (C52711NTw) abstractC54988OTw;
            C05A c05a = c52711NTw.A01;
            C51885MwT c51885MwT = (C51885MwT) c05a.getValue();
            c05a.F8m(new C51885MwT(c51885MwT.A00, c51885MwT.A01, c51885MwT.A02, c51885MwT.A03, c51885MwT.A04, true, c51885MwT.A05, c51885MwT.A07, c51885MwT.A0A, c51885MwT.A09, c51885MwT.A08));
            c52711NTw.A00 = false;
            return;
        }
        if (abstractC54988OTw instanceof C52709NTu) {
            C52709NTu c52709NTu = (C52709NTu) abstractC54988OTw;
            c52709NTu.A02 = false;
            c52709NTu.A03 = false;
            AbstractC25229BEm.A1R(c52709NTu.A01);
            c52709NTu.A04 = false;
            return;
        }
        if (abstractC54988OTw instanceof C52705NTq) {
            C52705NTq c52705NTq = (C52705NTq) abstractC54988OTw;
            c52705NTq.A01 = C05F.A0C;
            c52705NTq.A02 = AbstractC06930Yk.A0E();
            c52705NTq.A00 = null;
            return;
        }
        if (!(abstractC54988OTw instanceof C52714NTz)) {
            return;
        }
        C218914p.A05(((C52714NTz) abstractC54988OTw).A08);
    }

    public PES(AbstractC54988OTw abstractC54988OTw) {
        this.A00 = abstractC54988OTw;
    }

    @Override // X.InterfaceC58155PqK
    public final void D1H(RtcCallKey rtcCallKey) {
        AbstractC54988OTw abstractC54988OTw = this.A00;
        abstractC54988OTw.A00 = rtcCallKey;
        if (abstractC54988OTw instanceof NU4) {
            NU4 nu4 = (NU4) abstractC54988OTw;
            nu4.A0D.invoke(new VideoSubscriptions(AbstractC06930Yk.A0E()));
            if (nu4.A05) {
                C54610OAl c54610OAl = nu4.A07;
                InterfaceC58274PsS interfaceC58274PsS = c54610OAl.A00;
                if (interfaceC58274PsS != null) {
                    interfaceC58274PsS.AIo("call_ui_shown");
                }
                InterfaceC58274PsS interfaceC58274PsS2 = c54610OAl.A00;
                if (interfaceC58274PsS2 != null) {
                    interfaceC58274PsS2.AIo("self_first_frame_rendered");
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC54988OTw instanceof NU2) {
            NU2 nu2 = (NU2) abstractC54988OTw;
            if (!AbstractC166987dD.A0y().A0N() || nu2.A03 == null) {
                return;
            }
            C19L c19l = ((AbstractC54988OTw) nu2).A01;
            if (c19l != null) {
                PZC.A02(nu2, c19l, 3);
                return;
            }
            throw AbstractC166987dD.A14("This should not be called outside of call lifecycle!");
        }
        if (abstractC54988OTw instanceof NU0) {
            NU0 nu0 = (NU0) abstractC54988OTw;
            if (C37051o3.A00 == null) {
                C14360o3.A0F("plugin");
                throw C00O.createAndThrow();
            }
            Context context = nu0.A05;
            UserSession userSession = nu0.A06;
            AbstractC167007dF.A1K(context, userSession);
            OUG oug = new OUG(context, userSession);
            O4X o4x = nu0.A09;
            C14360o3.A0B(o4x, 0);
            synchronized (oug.A05) {
                oug.A00 = o4x;
            }
            nu0.A02 = oug;
            nu0.A03 = rtcCallKey.A00;
            return;
        }
        if (abstractC54988OTw instanceof C52711NTw) {
            C05A c05a = ((C52711NTw) abstractC54988OTw).A01;
            C51885MwT c51885MwT = (C51885MwT) c05a.getValue();
            Long A0g = AbstractC31173DnH.A0g();
            boolean z = c51885MwT.A04;
            boolean z2 = c51885MwT.A06;
            boolean z3 = c51885MwT.A05;
            boolean z4 = c51885MwT.A07;
            c05a.F8m(new C51885MwT(c51885MwT.A00, A0g, c51885MwT.A02, c51885MwT.A03, z, z2, z3, z4, c51885MwT.A0A, c51885MwT.A09, c51885MwT.A08));
            return;
        }
        if (abstractC54988OTw instanceof C52695NTg) {
            C52695NTg c52695NTg = (C52695NTg) abstractC54988OTw;
            MSY.A1N(new C51882MwQ(C18U.A06(C06090Tz.A05, c52695NTg.A00, 36314828956044106L)), c52695NTg.A01);
            return;
        }
        if (!(abstractC54988OTw instanceof C52696NTh)) {
            return;
        }
        MSY.A1N(new C51883MwR(null, "unknown", null), ((C52696NTh) abstractC54988OTw).A02);
    }

    @Override // X.InterfaceC58155PqK
    public final void D1I() {
        int i;
        InterfaceC06180Ui interfaceC06180Ui;
        Object obj;
        AbstractC54988OTw abstractC54988OTw = this.A00;
        abstractC54988OTw.A01 = null;
        abstractC54988OTw.A00 = null;
        if (abstractC54988OTw instanceof NU3) {
            NU3 nu3 = (NU3) abstractC54988OTw;
            if (nu3.A0H) {
                nu3.A08.APW();
                NU3.A01(nu3, nu3.A0E);
                nu3.A00 = null;
                C54612OAn c54612OAn = nu3.A09;
                C0QL c0ql = c54612OAn.A00;
                if (c0ql != null) {
                    c54612OAn.A02.unregisterReceiver(c0ql);
                }
                c54612OAn.A00 = null;
                return;
            }
            return;
        }
        if (abstractC54988OTw instanceof NU4) {
            NU4 nu4 = (NU4) abstractC54988OTw;
            nu4.A01 = 0L;
            C16910sj c16910sj = C16910sj.A00;
            if (!C14360o3.A0K(nu4.A04, c16910sj)) {
                nu4.A04 = c16910sj;
                AbstractC54157Nwt.A00(c16910sj, ((AbstractC54988OTw) nu4).A01, nu4.A0E);
            }
            i = 0;
            C51876MwK A01 = NU4.A01(nu4, false, false);
            if (!C14360o3.A0K(nu4.A02, A01)) {
                nu4.A02 = A01;
                AbstractC54157Nwt.A00(A01, ((AbstractC54988OTw) nu4).A01, nu4.A0F);
            }
            NU4.A04(nu4, NU4.A02(nu4));
            interfaceC06180Ui = nu4.A0G;
            obj = nu4.A03;
        } else {
            if (abstractC54988OTw instanceof C52702NTn) {
                C52702NTn c52702NTn = (C52702NTn) abstractC54988OTw;
                c52702NTn.A01 = false;
                c52702NTn.A00 = 0L;
                return;
            }
            if (abstractC54988OTw instanceof NU2) {
                NU2 nu2 = (NU2) abstractC54988OTw;
                nu2.A00 = NU2.A00(C17060sy.A01.A01(nu2.A04));
                nu2.A05.clear();
                nu2.A02 = NU2.A01(nu2);
                C51879MwN A012 = NU2.A01(nu2);
                if (C14360o3.A0K(nu2.A01, A012)) {
                    return;
                }
                MSY.A1N(A012, nu2.A07);
                nu2.A01 = A012;
                return;
            }
            if (abstractC54988OTw instanceof C52701NTm) {
                C52701NTm c52701NTm = (C52701NTm) abstractC54988OTw;
                C51860Mw4 c51860Mw4 = c52701NTm.A01;
                if (C14360o3.A0K(c52701NTm.A00, c51860Mw4)) {
                    return;
                }
                MSY.A1N(c51860Mw4, c52701NTm.A02);
                c52701NTm.A00 = c51860Mw4;
                return;
            }
            if (abstractC54988OTw instanceof C52710NTv) {
                C52710NTv c52710NTv = (C52710NTv) abstractC54988OTw;
                Integer num = C05F.A00;
                c52710NTv.A02 = num;
                C51863Mw7 c51863Mw7 = new C51863Mw7(num, null, 0L);
                c52710NTv.A01 = c51863Mw7;
                MSY.A1N(c51863Mw7, c52710NTv.A05);
                c52710NTv.A08.clear();
                return;
            }
            if (abstractC54988OTw instanceof C52706NTr) {
                ((C52706NTr) abstractC54988OTw).A03.clear();
                return;
            }
            if (abstractC54988OTw instanceof NU0) {
                NU0 nu0 = (NU0) abstractC54988OTw;
                C05A c05a = nu0.A0F;
                C26087BgG c26087BgG = new C26087BgG((MediaSyncState) null, (RtcStartCoWatchPlaybackArguments) null, (String) null, 15);
                C14360o3.A0B(c05a, 0);
                c05a.F8m(c26087BgG);
                OE0 oe0 = nu0.A08;
                oe0.A02 = false;
                oe0.A00 = 0;
                Runnable runnable = oe0.A01;
                if (runnable != null) {
                    oe0.A03.removeCallbacks(runnable);
                }
                nu0.A00 = null;
                OUG oug = nu0.A02;
                if (oug != null) {
                    synchronized (oug.A05) {
                        oug.A00 = null;
                        oug.A01 = null;
                    }
                }
                nu0.A02 = null;
                nu0.A01 = null;
                nu0.A03 = "";
                return;
            }
            if (abstractC54988OTw instanceof C52712NTx) {
                C52712NTx c52712NTx = (C52712NTx) abstractC54988OTw;
                C51870MwE c51870MwE = new C51870MwE(C16930sl.A00, "");
                if (C14360o3.A0K(c52712NTx.A00, c51870MwE)) {
                    return;
                }
                MSY.A1N(c51870MwE, c52712NTx.A02);
                c52712NTx.A00 = c51870MwE;
                return;
            }
            if (abstractC54988OTw instanceof C52713NTy) {
                C52713NTy c52713NTy = (C52713NTy) abstractC54988OTw;
                if (c52713NTy.A05.A00() instanceof NUJ) {
                    AvatarEffectsApiController avatarEffectsApiController = c52713NTy.A04;
                    avatarEffectsApiController.A02();
                    C25671My c25671My = avatarEffectsApiController.A07;
                    c25671My.A02(avatarEffectsApiController.A09, C441221u.class);
                    c25671My.A02(avatarEffectsApiController.A0B, C440921r.class);
                    c25671My.A02(avatarEffectsApiController.A0A, C441021s.class);
                    c25671My.A02(avatarEffectsApiController.A08, C55975Ot8.class);
                }
                c52713NTy.A01 = null;
                C52713NTy.A00(c52713NTy, C05F.A00);
                c52713NTy.A03 = false;
                c52713NTy.A00 = TriState.UNSET;
                return;
            }
            if (abstractC54988OTw instanceof NU5) {
                NU5 nu5 = (NU5) abstractC54988OTw;
                nu5.A0L.A08 = null;
                nu5.A0O.A01 = null;
                nu5.A00 = 0.0f;
                Integer num2 = C05F.A0C;
                NU5.A0C(nu5, num2);
                NU5.A05(null, nu5, num2, null, null);
                NU5.A0F(nu5, num2, null);
                NU5.A0G(nu5, num2, false);
                nu5.A0B = false;
                nu5.A02 = null;
                nu5.A01 = null;
                nu5.A0A = null;
                C05A c05a2 = nu5.A0X;
                EnumC53154Nf9 enumC53154Nf9 = EnumC53154Nf9.A05;
                C14360o3.A0B(c05a2, 0);
                c05a2.F8m(enumC53154Nf9);
                C05A c05a3 = nu5.A0Y;
                C14360o3.A0B(c05a3, 0);
                c05a3.F8m(false);
                C51887MwV A00 = NU5.A00(nu5);
                Integer num3 = C05F.A00;
                NU5.A0A(nu5, C51887MwV.A05(EnumC53279NhH.A04, A00, num3, "simple_gradient_background_0", -1432416257));
                nu5.A07 = null;
                nu5.A06 = null;
                nu5.A04 = null;
                nu5.A0T.clear();
                NU5.A0D(nu5, num3);
                return;
            }
            if (abstractC54988OTw instanceof C52699NTk) {
                MSY.A1N(new OT0(AbstractC06930Yk.A0E()), ((C52699NTk) abstractC54988OTw).A03);
                return;
            }
            if (abstractC54988OTw instanceof C52698NTj) {
                C52698NTj c52698NTj = (C52698NTj) abstractC54988OTw;
                C05A c05a4 = c52698NTj.A02;
                i = 0;
                C51868MwC c51868MwC = new C51868MwC(null, null, null, 0, 0L, 0L, 0L, 0L, false);
                C14360o3.A0B(c05a4, 0);
                c05a4.F8m(c51868MwC);
                interfaceC06180Ui = c52698NTj.A03;
                obj = new C51872MwG(null, null, null, 0L);
            } else {
                if (abstractC54988OTw instanceof C52711NTw) {
                    C05A c05a5 = ((C52711NTw) abstractC54988OTw).A01;
                    C51885MwT c51885MwT = (C51885MwT) c05a5.getValue();
                    boolean z = c51885MwT.A04;
                    boolean z2 = c51885MwT.A06;
                    boolean z3 = c51885MwT.A05;
                    boolean z4 = c51885MwT.A07;
                    c05a5.F8m(new C51885MwT(c51885MwT.A00, null, null, c51885MwT.A03, z, z2, z3, z4, true, c51885MwT.A09, c51885MwT.A08));
                    return;
                }
                if (abstractC54988OTw instanceof C52695NTg) {
                    interfaceC06180Ui = ((C52695NTg) abstractC54988OTw).A01;
                    i = 0;
                    obj = new C51882MwQ(false);
                } else {
                    if (abstractC54988OTw instanceof C52709NTu) {
                        C52709NTu c52709NTu = (C52709NTu) abstractC54988OTw;
                        c52709NTu.A02 = false;
                        c52709NTu.A03 = false;
                        AbstractC25229BEm.A1R(c52709NTu.A01);
                        c52709NTu.A04 = false;
                        return;
                    }
                    if (abstractC54988OTw instanceof C52696NTh) {
                        MSY.A1N(new C51883MwR(null, "unknown", null), ((C52696NTh) abstractC54988OTw).A02);
                        return;
                    }
                    if (abstractC54988OTw instanceof C52707NTs) {
                        C52707NTs c52707NTs = (C52707NTs) abstractC54988OTw;
                        c52707NTs.A01 = false;
                        c52707NTs.A00 = C16930sl.A00;
                        c52707NTs.A02 = false;
                        return;
                    }
                    if (abstractC54988OTw instanceof C52704NTp) {
                        C52704NTp c52704NTp = (C52704NTp) abstractC54988OTw;
                        C16930sl c16930sl = C16930sl.A00;
                        if (!C14360o3.A0K(c52704NTp.A00, c16930sl)) {
                            c52704NTp.A00 = c16930sl;
                        }
                        i = 0;
                        interfaceC06180Ui = c52704NTp.A03;
                        obj = false;
                    } else {
                        if (abstractC54988OTw instanceof C52705NTq) {
                            C52705NTq c52705NTq = (C52705NTq) abstractC54988OTw;
                            c52705NTq.A01 = C05F.A0C;
                            c52705NTq.A02 = AbstractC06930Yk.A0E();
                            c52705NTq.A00 = null;
                            return;
                        }
                        if (abstractC54988OTw instanceof C52703NTo) {
                            ((C52703NTo) abstractC54988OTw).A00.clear();
                            return;
                        }
                        if (!(abstractC54988OTw instanceof C52714NTz)) {
                            return;
                        }
                        C52714NTz c52714NTz = (C52714NTz) abstractC54988OTw;
                        C218914p.A06(c52714NTz.A08);
                        ((C54812OKl) c52714NTz.A0B.getValue()).A01(true);
                        c52714NTz.A03 = false;
                        c52714NTz.A01 = false;
                        c52714NTz.A04 = false;
                        c52714NTz.A05 = false;
                        c52714NTz.A07 = false;
                        return;
                    }
                }
            }
        }
        C14360o3.A0B(interfaceC06180Ui, i);
        interfaceC06180Ui.F8m(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1099:0x0fbb, code lost:
    
        if (r11 != false) goto L905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1102:0x0eef, code lost:
    
        if (r2 != null) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1232:0x1255, code lost:
    
        if ((r13 - r1.longValue()) >= (X.C18U.A01(X.C06090Tz.A05, r0.A02, 36594959608252406L) + 30000)) goto L1061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0182, code lost:
    
        if (r7 == X.EnumC53174NfV.A07) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1272:0x12de, code lost:
    
        if (r2 != true) goto L1090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00e7, code lost:
    
        if (r6 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0204, code lost:
    
        if (r3.audioEnabled == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0209, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x020c, code lost:
    
        if (r3.videoEnabled != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x020e, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x020f, code lost:
    
        r9 = r2.A03;
        r10 = r2.A01;
        r7 = r2.A00;
        X.AbstractC167027dH.A12(r8, r9, r10);
        X.C14360o3.A0B(r7, 5);
        r6 = new X.C51876MwK(r7, r8, r9, r10, r11, r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0228, code lost:
    
        if (X.C14360o3.A0K(r0.A02, r6) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x022a, code lost:
    
        r0.A02 = r6;
        X.AbstractC54157Nwt.A00(r6, ((X.AbstractC54988OTw) r0).A01, r0.A0F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0233, code lost:
    
        if (r4 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0235, code lost:
    
        r4.add(r3.userId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x026b, code lost:
    
        r4 = X.C16910sj.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0207, code lost:
    
        if (r6 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0269, code lost:
    
        if (r4 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02b9, code lost:
    
        if (r1.audioEnabled != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x031b, code lost:
    
        if (r6 != null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x031f, code lost:
    
        if (r2 != null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03d7, code lost:
    
        if (r1.state != 1) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03ea, code lost:
    
        if (r3 != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0a0d, code lost:
    
        if (r5 == null) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x05bb, code lost:
    
        if (r2 != true) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        if (r11.size() > (((int) r0.A05) + 1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0713, code lost:
    
        if (r1.A06 == true) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
    
        if (r9.screenShareStopSharing != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x068c, code lost:
    
        if (r7 != null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0a75, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A00, 36310894768292215L) != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e3, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0b30, code lost:
    
        if (r1.videoEnabled != true) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0b98, code lost:
    
        if (r9.A01() == false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:999:0x0ebd, code lost:
    
        if (r4.groupRoomType == 11) goto L878;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v86, types: [X.Mw4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58155PqK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDj(X.C51759Mti r29) {
        /*
            Method dump skipped, instructions count: 4954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PES.DDj(X.Mti):void");
    }
}
