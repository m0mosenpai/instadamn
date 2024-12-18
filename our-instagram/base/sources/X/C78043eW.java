package X;

import android.content.Context;

/* renamed from: X.3eW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78043eW implements InterfaceC77833eB {
    public final InterfaceC78033eV A00;
    public final C2YO A01 = new Object();
    public final String A02;

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(context, 0);
        C2YO c2yo = this.A01;
        c2yo.A00 = context;
        try {
            return this.A00.ADT(c2yo, obj, obj3);
        } finally {
            c2yo.A00 = null;
        }
    }

    @Override // X.InterfaceC77833eB
    public final Class CBk() {
        return this.A00.getClass();
    }

    @Override // X.InterfaceC77833eB
    public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return this.A00.Ek2(obj, obj2, obj3, obj4);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C79773hS c79773hS = (C79773hS) obj4;
        C14360o3.A0B(context, 0);
        C2YO c2yo = this.A01;
        c2yo.A00 = context;
        if (c79773hS != null) {
            try {
                c79773hS.A00.invoke();
            } finally {
                c2yo.A00 = null;
            }
        }
    }

    @Override // X.InterfaceC77833eB
    public final String getDescription() {
        String str = this.A02;
        if (str == null) {
            str = this.A00.getDescription();
        }
        return AnonymousClass001.A0R("binder:", str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2YO] */
    public C78043eW(InterfaceC78033eV interfaceC78033eV, String str) {
        this.A02 = str;
        this.A00 = interfaceC78033eV;
    }
}
