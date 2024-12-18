package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with DiscoveryChainingSponsoredContentInjectorKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use DiscoveryChainingSponsoredContentInjectorKt depending on A/B test state.")
/* renamed from: X.Iz9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42957Iz9 implements InterfaceC671231d {
    public InterfaceC42381xS A01;
    public final UserSession A03;
    public final DiscoveryChainingItem A04;
    public final C38018Go6 A05;
    public final java.util.Set A02 = AbstractC166987dD.A1H();
    public int A00 = -1;

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final void DrH() {
    }

    @Override // X.InterfaceC671231d
    public final void E6u(String str, List list, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        throw AbstractC166987dD.A1D("Ad pod is not supported for Explore.");
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        return this.A05.A01();
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        return this.A05.A02();
    }

    @Override // X.InterfaceC671231d
    public final Integer COV(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
        if (i >= 0) {
            C38018Go6 c38018Go6 = this.A05;
            if (i <= c38018Go6.B5m()) {
                String str = this.A04.A0E;
                Object BUM = interfaceC42381xS.BUM();
                C40971v4 c40971v4 = (C40971v4) BUM;
                C38321qM c38321qM = c40971v4.A0K;
                if (c38321qM != null) {
                    c38018Go6.BRZ(c38321qM).A2Q = true;
                }
                UserSession userSession = this.A03;
                if (C32V.A04(userSession, c38321qM.CdW())) {
                    return C05F.A03;
                }
                C38169Gqa A00 = AbstractC38168GqZ.A00(userSession);
                List singletonList = Collections.singletonList(BUM);
                if (A00.A00.containsKey(str)) {
                    A00.A02.get(str);
                }
                c38018Go6.A06(singletonList, i);
                this.A02.add(c40971v4.A0S);
                this.A00 = Math.max(this.A00, i);
                this.A01 = interfaceC42381xS;
                return C05F.A00;
            }
        }
        C0w9.A03("explore_acp", "Attempted to inject an item out of bounds at position: $position");
        return C05F.A0C;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        return this.A02.contains(((C40971v4) obj).A0S);
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Explore");
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        throw AbstractC166987dD.A1D("un injecting most recent item is supported in stories only");
    }

    public C42957Iz9(UserSession userSession, DiscoveryChainingItem discoveryChainingItem, C38018Go6 c38018Go6) {
        this.A05 = c38018Go6;
        this.A03 = userSession;
        this.A04 = discoveryChainingItem;
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
