package X;

/* renamed from: X.4F4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4F4 implements InterfaceC66482zP {
    public static final Object A00 = new Object();

    @Override // X.InterfaceC66482zP
    public final Object getKey() {
        if (this instanceof C4F3) {
            return "FriendMapEntryPoint";
        }
        if (this instanceof C4FM) {
            C4FM c4fm = (C4FM) this;
            return AnonymousClass001.A0i("MediaNoteStack-", c4fm.A0B, c4fm.A06.getId(), '-');
        }
        return A00;
    }
}
