package X;

import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;

/* renamed from: X.04g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C011804g extends C0i0 {
    public final /* synthetic */ ActivityThreadBinderHooker$ApplicationThreadBinderHook A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C011804g(ActivityThreadBinderHooker$ApplicationThreadBinderHook activityThreadBinderHooker$ApplicationThreadBinderHook) {
        this();
        this.A00 = activityThreadBinderHooker$ApplicationThreadBinderHook;
    }

    @Override // X.C0i0
    public final String A03() {
        String interfaceDescriptor = this.A00.getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            return "<No desc, likely not hooked>";
        }
        return interfaceDescriptor;
    }

    public C011804g() {
        super(true, false);
    }
}
