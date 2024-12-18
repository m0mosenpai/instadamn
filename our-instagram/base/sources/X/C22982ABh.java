package X;

import java.io.File;
import java.io.FileDescriptor;

/* renamed from: X.ABh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22982ABh {
    public int A00;
    public C23106AGs A01;
    public File A02;
    public FileDescriptor A03;
    public String A04;
    public boolean A05;

    public final void A00(C22826A4v c22826A4v, Object obj) {
        switch (c22826A4v.A00) {
            case 0:
                this.A02 = (File) obj;
                return;
            case 1:
                this.A03 = (FileDescriptor) obj;
                return;
            case 2:
                this.A04 = (String) obj;
                return;
            case 3:
                this.A05 = AbstractC166987dD.A1a(obj);
                return;
            case 4:
                this.A01 = (C23106AGs) obj;
                return;
            default:
                this.A00 = AbstractC166987dD.A0H(obj);
                return;
        }
    }
}
