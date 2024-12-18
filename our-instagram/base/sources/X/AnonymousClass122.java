package X;

/* renamed from: X.122, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass122 extends AbstractC211911v {
    public AbstractC12990ll A00;
    public final AbstractC12280kW A01;
    public final C17090t4 A02;

    public AnonymousClass122(AbstractC12280kW abstractC12280kW, C17090t4 c17090t4) {
        C14360o3.A0B(abstractC12280kW, 1);
        C14360o3.A0B(c17090t4, 2);
        this.A01 = abstractC12280kW;
        this.A02 = c17090t4;
    }

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "SESSION_INIT_START", j);
        c226418s.A0Q(c226418s.A02, "SESSION_INIT_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "SessionInitializer";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15s, java.lang.Object] */
    @Override // X.AbstractC211911v
    public final void A07() {
        C09Y c09y = C023409i.A0A;
        C17090t4 c17090t4 = this.A02;
        ?? obj = new Object();
        if (C09Z.A00 == null) {
            C09Z.A00 = AbstractC09440dt.A01(new C0A3(c17090t4, obj));
        }
        this.A00 = c09y.A05(this.A01);
    }

    public final AbstractC12990ll A08() {
        AbstractC12990ll abstractC12990ll = this.A00;
        if (abstractC12990ll != null) {
            return abstractC12990ll;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }
}
