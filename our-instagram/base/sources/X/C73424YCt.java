package X;

/* renamed from: X.YCt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73424YCt implements YNw {
    public final C72742XmE A00;

    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00.A01, "zero_sdk_dispatched_event");
        if (A0f.isSampled()) {
            A0f.AAP("action_name", abstractC72503XfI.A00());
            A0f.A9K("dispatch_time", Long.valueOf(abstractC72503XfI.A00));
            A0f.Cht();
        }
    }

    public C73424YCt(C72742XmE c72742XmE) {
        this.A00 = c72742XmE;
    }
}
