package X;

import com.instagram.clips.intf.ClipsWatchAndBrowseData;

/* renamed from: X.J0o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43023J0o implements InterfaceC65577TnB {
    public final /* synthetic */ ClipsWatchAndBrowseData A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C37634GhT A02;

    @Override // X.InterfaceC65577TnB
    public final /* synthetic */ void D08() {
    }

    @Override // X.InterfaceC65577TnB
    public final /* synthetic */ void DWf() {
    }

    public C43023J0o(ClipsWatchAndBrowseData clipsWatchAndBrowseData, C38321qM c38321qM, C37634GhT c37634GhT) {
        this.A02 = c37634GhT;
        this.A01 = c38321qM;
        this.A00 = clipsWatchAndBrowseData;
    }

    @Override // X.InterfaceC65577TnB
    public final void DBZ() {
        C37634GhT c37634GhT = this.A02;
        C37635GhU.A00(c37634GhT.A09, this.A01, c37634GhT.A0A, "double_tap", "fullscreen");
    }

    @Override // X.InterfaceC65577TnB
    public final boolean DQq() {
        C37634GhT c37634GhT = this.A02;
        C37635GhU.A00(c37634GhT.A09, this.A01, c37634GhT.A0A, "long_press", "fullscreen");
        return this.A00.A0G;
    }

    @Override // X.InterfaceC65577TnB
    public final void DmX() {
        C37634GhT c37634GhT = this.A02;
        C37635GhU.A00(c37634GhT.A09, this.A01, c37634GhT.A0A, "single_tap", "fullscreen");
    }
}
