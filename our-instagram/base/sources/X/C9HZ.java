package X;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* renamed from: X.9HZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HZ extends ComposeShader implements InterfaceC161477Li {
    public final Shader A00;
    public final Shader A01;

    @Override // X.InterfaceC161477Li
    public final void Eg1(int i) {
        Object obj = this.A00;
        if (obj instanceof InterfaceC161477Li) {
            ((InterfaceC161477Li) obj).Eg1(i);
        }
        Object obj2 = this.A01;
        if (obj2 instanceof InterfaceC161477Li) {
            ((InterfaceC161477Li) obj2).Eg1(i);
        }
    }

    public C9HZ(Shader shader, Shader shader2, PorterDuff.Mode mode) {
        super(shader, shader2, mode);
        this.A00 = shader;
        this.A01 = shader2;
    }
}
