package X;

import android.content.Context;

/* renamed from: X.3MI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3MI {
    public static final C3MJ A00(Context context, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(context, 1);
        C11T.A06("This operation must be run on UI thread.");
        return (C3MJ) abstractC12990ll.A01(C3MJ.class, new C9F5(0, context.getApplicationContext(), abstractC12990ll));
    }
}
