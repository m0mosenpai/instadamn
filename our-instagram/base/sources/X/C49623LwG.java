package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.LwG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49623LwG implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C49623LwG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C189478aR A00(C189448aO c189448aO, Object obj, int i) {
        c189448aO.A0U = new C49623LwG(obj, i);
        return c189448aO.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b8, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a7, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c4, code lost:
    
        X.F3X.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c7, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.fragment.app.Fragment, X.KBQ, X.2oe] */
    @Override // X.InterfaceC1119153d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Czx() {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49623LwG.Czx():void");
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
        String str;
        C51C c51c;
        AnonymousClass983 anonymousClass983;
        switch (this.A00) {
            case 3:
                C44547Jmr c44547Jmr = (C44547Jmr) this.A01;
                C44547Jmr.A01(c44547Jmr, false);
                AddChannelsRowChannelInfo addChannelsRowChannelInfo = c44547Jmr.A00;
                if (addChannelsRowChannelInfo == null) {
                    return;
                }
                C142846ck A0d = AbstractC31172DnG.A0d(c44547Jmr.A04);
                List A1J = AbstractC166987dD.A1J(addChannelsRowChannelInfo.A01);
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (!AbstractC25226BEj.A1Z(A0I)) {
                    return;
                }
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1I(A0I, "selected_tagged_channels");
                A0I.A0o("done_button");
                A0I.A0p("tag_channels_sheet");
                A0I.A0n("instagram");
                A0I.A0r(null);
                A0I.A0h(null);
                A0I.A0u(A0d.A01);
                AbstractC31178DnM.A1G(A0I, MSV.A00(215), A1J.toString());
                return;
            case 8:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                if (!(abstractC59962oe instanceof C51C) || (c51c = (C51C) abstractC59962oe) == null || (anonymousClass983 = c51c.A00) == null) {
                    return;
                }
                anonymousClass983.A0H();
                return;
            case 10:
                C45466KBb.A0C((C45466KBb) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                if (!AbstractC167007dF.A1Z(c45466KBb.A1N)) {
                    return;
                }
                Jn6 A02 = C45466KBb.A02(c45466KBb);
                A02.A0E.Egh(EnumC46184KcM.A08);
                Jn6.A00(A02);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                L6L l6l = (L6L) this.A01;
                if (l6l == null) {
                    return;
                }
                l6l.A00();
                return;
            case 20:
                LLk lLk = ((C47435KxQ) this.A01).A00;
                KDI kdi = lLk.A05;
                if (kdi != null) {
                    C45527KDs c45527KDs = (C45527KDs) kdi.A08.getValue();
                    UserSession A0M = AbstractC31180DnO.A0M(kdi.A07);
                    C05A c05a = c45527KDs.A00;
                    c05a.Egh(AbstractC46782Kmd.A00(A0M).A00.A02);
                    C05A c05a2 = c45527KDs.A02;
                    c05a2.Egh(AbstractC001800i.A0j(C4I4.A00(A0M).A00));
                    C45527KDs.A00((C4I3) c05a.getValue(), c45527KDs);
                    for (EnumC46248KdP enumC46248KdP : EnumC46248KdP.A04) {
                        C05A c05a3 = c45527KDs.A03;
                        AbstractMap abstractMap = (AbstractMap) c05a3.getValue();
                        String str2 = enumC46248KdP.A02;
                        if (abstractMap.containsKey(str2)) {
                            Map A15 = AbstractC43592JPx.A15(c05a3);
                            if (((java.util.Set) c05a2.getValue()).contains(enumC46248KdP)) {
                                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                            } else {
                                str = "0";
                            }
                            A15.put(str2, str);
                        }
                    }
                }
                if (!lLk.A0B) {
                    UserSession userSession = lLk.A0h;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317139649893186L)) {
                        LEW.A00(lLk.A0m, "filter_bottom_sheet_dismiss", null, null, null, lLk.A0j.A05());
                    }
                }
                lLk.A0B = false;
                return;
            default:
                return;
        }
    }
}
