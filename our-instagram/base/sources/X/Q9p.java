package X;

/* loaded from: classes10.dex */
public final class Q9p extends Q9s {
    public Q9p() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    @Override // X.AbstractC63646SrC
    public final boolean A01() {
        if (!super.A01() || !SVN.A00("MULTI_PROCESS")) {
            return false;
        }
        if (SVN.A0R.A01()) {
            return AbstractC62296S5r.A00.C0E().isMultiProcessEnabled();
        }
        throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
