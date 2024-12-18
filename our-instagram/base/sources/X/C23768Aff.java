package X;

import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.Aff, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23768Aff implements InterfaceC185958Mp, C8BD {
    public final C8D9 A00;
    public final ViewOnTouchListenerC1829889t A01;
    public final InterfaceC143326dX A02;
    public final EyedropperColorPickerTool A03;
    public final C8DU A04;
    public final InterfaceC16660sJ A05;

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFL() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        this.A05.invoke(Integer.valueOf(i));
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        this.A01.A09.remove(this);
        this.A00.A02(false);
        AbstractC166997dE.A1L(this.A03, false);
        this.A02.D5W(this);
        return true;
    }

    public C23768Aff(C8D9 c8d9, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, InterfaceC143326dX interfaceC143326dX, C8DU c8du, EyedropperColorPickerTool eyedropperColorPickerTool, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1R(c8d9, eyedropperColorPickerTool);
        C14360o3.A0B(c8du, 6);
        this.A02 = interfaceC143326dX;
        this.A00 = c8d9;
        this.A03 = eyedropperColorPickerTool;
        this.A01 = viewOnTouchListenerC1829889t;
        this.A05 = interfaceC16660sJ;
        this.A04 = c8du;
    }
}
