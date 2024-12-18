package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.VSt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68488VSt {
    public static final void A00(C38657Gyy c38657Gyy, InterfaceC71952XCe interfaceC71952XCe, UI4 ui4) {
        boolean A1U = AbstractC167007dF.A1U(interfaceC71952XCe);
        boolean Ejj = interfaceC71952XCe.Ejj(c38657Gyy);
        IgdsButton igdsButton = ui4.A00;
        if (Ejj) {
            igdsButton.setVisibility(A1U ? 1 : 0);
            igdsButton.setText(c38657Gyy.A08);
            WNP.A00(igdsButton, 34, interfaceC71952XCe, c38657Gyy);
        } else {
            igdsButton.setVisibility(8);
            igdsButton.setOnClickListener(null);
        }
    }
}
