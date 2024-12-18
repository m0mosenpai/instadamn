package X;

import java.util.LinkedList;

/* renamed from: X.Ip7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42345Ip7 implements InterfaceC13000lm {
    public static final FXK A02 = new Object();
    public boolean A00;
    public final LinkedList A01 = new LinkedList();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A00 = false;
    }
}
