package X;

/* loaded from: classes6.dex */
public final class GMF implements Runnable {
    public final /* synthetic */ C32281EJs A00;

    public GMF(C32281EJs c32281EJs) {
        this.A00 = c32281EJs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32281EJs c32281EJs = this.A00;
        if (c32281EJs.isResumed()) {
            if (c32281EJs.requireParentFragment().getChildFragmentManager().A0L() > 0) {
                c32281EJs.requireParentFragment().getChildFragmentManager().A0b();
            } else {
                AbstractC25226BEj.A1Q(c32281EJs);
            }
            AbstractC31176DnK.A0y(c32281EJs.getActivity(), C56352iT.A0t);
        }
    }
}
