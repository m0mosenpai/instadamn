package X;

import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.LXq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48267LXq implements InterfaceC26491Qe {
    public final /* synthetic */ View A00;
    public final /* synthetic */ LF3 A01;
    public final /* synthetic */ C8OT A02;
    public final /* synthetic */ InterfaceC148316m1 A03;
    public final /* synthetic */ ByteArrayOutputStream A04;

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        this.A04.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
    }

    public C48267LXq(View view, LF3 lf3, C8OT c8ot, InterfaceC148316m1 interfaceC148316m1, ByteArrayOutputStream byteArrayOutputStream) {
        this.A04 = byteArrayOutputStream;
        this.A02 = c8ot;
        this.A01 = lf3;
        this.A03 = interfaceC148316m1;
        this.A00 = view;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        try {
            C8OT c8ot = this.A02;
            File file = new File(c8ot.A0g.C5c(), AnonymousClass001.A0R(c8ot.A0k, "_webp"));
            new FileOutputStream(file).write(this.A04.toByteArray());
            String absolutePath = file.getAbsolutePath();
            C14360o3.A07(absolutePath);
            c8ot.A0D = null;
            C74P.A04(c8ot, absolutePath);
            LF3 lf3 = this.A01;
            InterfaceC150196pR interfaceC150196pR = lf3.A01;
            if (interfaceC150196pR != null) {
                InterfaceC148316m1 interfaceC148316m1 = this.A03;
                interfaceC150196pR.CxM(lf3.A0A.getDrawable(), this.A00, interfaceC148316m1);
            }
        } catch (IOException unused) {
        }
    }
}
