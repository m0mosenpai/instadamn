package X;

import android.content.Context;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* renamed from: X.Uvn */
/* loaded from: classes11.dex */
public final class C67675Uvn extends AbstractC67779Uxv implements X9f {
    public UvJ A00;
    public final C70302WQh A01;

    @Override // X.X9f
    public void setViewModel(UvJ uvJ) {
        C14360o3.A0B(uvJ, 0);
        this.A00 = uvJ;
        setHint(getResources().getString(uvJ.A00));
        BaseAutoCompleteTextView inputText = getInputText();
        UvJ uvJ2 = this.A00;
        if (uvJ2 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        inputText.setText(uvJ2.A02[0]);
        setDescendantFocusability(393216);
        getInputText().setOnClickListener(new WNN(this, 19));
        getInputText().setLongClickable(false);
    }

    public final String[] getOptions() {
        UvJ uvJ = this.A00;
        if (uvJ == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        int[] iArr = uvJ.A02;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = getResources().getString(iArr[i]);
        }
        return strArr;
    }

    public C67675Uvn(Context context) {
        super(context);
        this.A01 = new C70302WQh(this, 40);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1395454848);
        super.onAttachedToWindow();
        UvJ uvJ = this.A00;
        if (uvJ == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        uvJ.A05.A09(this.A01);
        C0f9.A0D(447354695, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1144223234);
        super.onDetachedFromWindow();
        UvJ uvJ = this.A00;
        if (uvJ == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        uvJ.A05.A08(this.A01);
        C0f9.A0D(-1547237695, A06);
    }
}
