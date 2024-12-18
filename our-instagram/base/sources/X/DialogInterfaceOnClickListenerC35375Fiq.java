package X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: X.Fiq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35375Fiq implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public DialogInterfaceOnClickListenerC35375Fiq(InterfaceC37210GaL interfaceC37210GaL, GZ6 gz6, C35123FeQ c35123FeQ, C3o9 c3o9, Map map, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = c35123FeQ;
        this.A04 = c3o9;
        this.A01 = i;
        this.A05 = interfaceC37210GaL;
        this.A06 = gz6;
        this.A07 = map;
        this.A02 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35123FeQ c35123FeQ = (C35123FeQ) this.A03;
        C3o9 c3o9 = (C3o9) this.A04;
        int i2 = this.A01;
        InterfaceC37210GaL interfaceC37210GaL = (InterfaceC37210GaL) this.A05;
        GZ6 gz6 = (GZ6) this.A06;
        Map map = (Map) this.A07;
        int i3 = this.A02;
        interfaceC37210GaL.Doc();
        if (i3 != 1) {
            C35123FeQ.A01(c35123FeQ, c3o9, map, i2);
        }
        gz6.Dod(c3o9, i2);
    }
}
