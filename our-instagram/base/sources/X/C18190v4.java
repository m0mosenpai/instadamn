package X;

/* renamed from: X.0v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18190v4 extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18190v4(long j) {
        super(673, 5, false, true);
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C18920wW A00 = new C12210kP(AbstractC12960li.A00).A00();
        C25531Mh c25531Mh = new C25531Mh(A00.A00(A00.A00, "ig_executor_stuck_worker"), 219);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0Q("task_id", Long.valueOf(this.A00));
            c25531Mh.A0R("stack_trace", "");
            c25531Mh.Cht();
        }
    }
}
