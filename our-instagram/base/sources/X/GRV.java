package X;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class GRV implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public GRV(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                final C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                final TextView textView = (TextView) this.A02;
                final View view = (View) this.A03;
                final C55196Oe3 c55196Oe3 = (C55196Oe3) obj;
                ScrollView scrollView = c31721DwQ.A0D;
                InterfaceC57965PnB interfaceC57965PnB = new InterfaceC57965PnB() { // from class: X.P6E
                    @Override // X.InterfaceC57965PnB
                    public final void D39() {
                        final C31721DwQ c31721DwQ2 = c31721DwQ;
                        View view2 = view;
                        final TextView textView2 = textView;
                        final C55196Oe3 c55196Oe32 = c55196Oe3;
                        view2.postDelayed(new Runnable() { // from class: X.PSg
                            @Override // java.lang.Runnable
                            public final void run() {
                                C31721DwQ c31721DwQ3 = c31721DwQ2;
                                TextView textView3 = textView2;
                                C55196Oe3 c55196Oe33 = c55196Oe32;
                                int width = textView3.getWidth() - (((int) textView3.getPaint().measureText(textView3.getText().toString())) / 2);
                                FragmentActivity requireActivity = c31721DwQ3.requireActivity();
                                int ordinal = c55196Oe33.A02.ordinal();
                                if (ordinal != 9) {
                                    if (ordinal != 3) {
                                        if (ordinal == 2) {
                                            R1K r1k = c55196Oe33.A03;
                                            if (r1k.hasFieldValue("is_bloks") && r1k.getCoercedBooleanField(9, "is_bloks")) {
                                                C55196Oe3.A01(requireActivity, c55196Oe33);
                                                return;
                                            } else {
                                                C55196Oe3.A02(requireActivity, c55196Oe33);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    throw AbstractC166987dD.A12("Tooltip show config is required for tooltip");
                                }
                                String A0B = c55196Oe33.A03.A0B(DialogModule.KEY_TITLE);
                                if (A0B == null) {
                                    return;
                                }
                                if (c55196Oe33.A08()) {
                                    C55196Oe3.A04(c55196Oe33, "LOG_EXPOSURE");
                                    return;
                                }
                                C5SU A0b = MSZ.A0b(requireActivity, A0B);
                                A0b.A04(textView3, width, 0, false);
                                A0b.A02();
                                C55196Oe3.A03(A0b, c55196Oe33, requireActivity);
                            }
                        }, 100L);
                    }
                };
                C14360o3.A0B(scrollView, 0);
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC55506Okz(textView, scrollView, interfaceC57965PnB));
                break;
            case 1:
                FHL fhl = (FHL) this.A01;
                C189478aR c189478aR = (C189478aR) this.A02;
                SavedCollection savedCollection = (SavedCollection) this.A03;
                c189478aR.A0L(null);
                EM6 em6 = fhl.A00;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CollectionPrivacyModeEnum collectionPrivacyModeEnum = savedCollection.A00;
                CollectionPrivacyModeEnum collectionPrivacyModeEnum2 = CollectionPrivacyModeEnum.A06;
                boolean z = true;
                if (booleanValue == AbstractC167007dF.A1X(collectionPrivacyModeEnum, collectionPrivacyModeEnum2)) {
                    z = false;
                }
                if (!booleanValue) {
                    collectionPrivacyModeEnum2 = CollectionPrivacyModeEnum.A05;
                }
                savedCollection.A00 = collectionPrivacyModeEnum2;
                try {
                    AbstractC35217FgA.A02(collectionPrivacyModeEnum2, em6, new EUO(5, em6, z), em6.A05, savedCollection.A0F, savedCollection.A0G, savedCollection.A0H);
                } catch (IOException unused) {
                    EM6.A01(em6);
                    FOR r0 = em6.A09;
                    if (r0 != null) {
                        FB3.A00(r0);
                    }
                }
                EM6.A05(em6);
                break;
            default:
                return LJY.A00((LJY) this.A01, (Collection) this.A02, (Collection) this.A03, (InterfaceC23621Ds) obj);
        }
        return C0eB.A00;
    }
}
