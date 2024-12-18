package X;

import android.content.ComponentName;

/* renamed from: X.TIa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64524TIa implements Comparable {
    public final ComponentName A00;
    public final C72080XMy A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.A02 - ((C64524TIa) obj).A01.A02;
    }

    public C64524TIa(ComponentName componentName, C72080XMy c72080XMy) {
        this.A01 = c72080XMy;
        this.A00 = componentName;
    }
}
