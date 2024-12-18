package X;

/* renamed from: X.Wd1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70567Wd1 implements C2JL {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        String message = th.getMessage();
        if (message == null) {
            message = AbstractC111324zv.A00(639);
        }
        interfaceC16660sJ.invoke(new Exception(message));
    }

    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(AnonymousClass436 anonymousClass436) {
        Enum r1;
        Object A00;
        C2JS c2js;
        C2JS c2js2;
        if (anonymousClass436 != null && (c2js2 = (C2JS) anonymousClass436.Bos()) != null) {
            r1 = c2js2.getOptionalEnumField(0, "xfb_post_new_user_day_zero_language_signal(data:{\"device_signals\":{\"keyboard_signals\":{\"current_language\":$current_language,\"input_methods\":$input_methods}}})", EnumC68184VFc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            r1 = null;
        }
        if (r1 == EnumC68184VFc.SUCCESS) {
            this.A00.invoke();
            return;
        }
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1795));
        if (anonymousClass436 == null || (c2js = (C2JS) anonymousClass436.Bos()) == null || (A00 = c2js.getOptionalEnumField(0, "xfb_post_new_user_day_zero_language_signal(data:{\"device_signals\":{\"keyboard_signals\":{\"current_language\":$current_language,\"input_methods\":$input_methods}}})", EnumC68184VFc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            A00 = AbstractC111324zv.A00(639);
        }
        String A0v = AbstractC166997dE.A0v(A00, sb);
        C14360o3.A0B(A0v, 1);
        interfaceC16660sJ.invoke(new Exception(A0v));
    }

    public C70567Wd1(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16660sJ;
    }
}
