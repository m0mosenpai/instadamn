package X;

/* renamed from: X.06S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06S extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ char[] A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06S(char[] cArr) {
        super(2);
        this.A00 = cArr;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C14360o3.A0B(charSequence, 0);
        int A09 = AbstractC001900j.A09(charSequence, this.A00, intValue);
        if (A09 < 0) {
            return null;
        }
        return new C09530e4(Integer.valueOf(A09), 1);
    }
}
