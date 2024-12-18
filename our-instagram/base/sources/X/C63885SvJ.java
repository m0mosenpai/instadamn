package X;

import android.content.Context;

/* renamed from: X.SvJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63885SvJ implements InterfaceC65610To1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SWS A01;

    public C63885SvJ(Context context, SWS sws) {
        this.A01 = sws;
        this.A00 = context;
    }

    @Override // X.InterfaceC65610To1
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00.getSystemService("connectivity");
    }
}
