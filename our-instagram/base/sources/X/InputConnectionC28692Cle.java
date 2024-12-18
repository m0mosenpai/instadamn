package X;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: X.Cle, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class InputConnectionC28692Cle implements InputConnection {
    public int A00;
    public int A01;
    public C5C3 A02;
    public boolean A03;
    public final CWQ A05;
    public final InterfaceC30780DgH A06;
    public final BXF A07;
    public final C59J A08;
    public final boolean A0A;
    public final List A09 = AbstractC166987dD.A1E();
    public boolean A04 = true;

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        int i2 = 0;
        boolean z = (i & 1) != 0;
        this.A03 = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.A01 = i2;
        }
        return AbstractC25236BEt.A0E(this.A02);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public static final void A00(InputConnectionC28692Cle inputConnectionC28692Cle, InterfaceC30912DiP interfaceC30912DiP) {
        inputConnectionC28692Cle.A00++;
        try {
            inputConnectionC28692Cle.A09.add(interfaceC30912DiP);
        } finally {
            inputConnectionC28692Cle.A01();
        }
    }

    private final boolean A01() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            List list = this.A09;
            if (AbstractC166987dD.A1b(list)) {
                ((C28779CnB) this.A06).A00.A07.invoke(AbstractC166987dD.A1F(list));
                list.clear();
            }
        }
        if (this.A00 > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.A04;
        if (z) {
            this.A00++;
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.A09.clear();
        this.A00 = 0;
        this.A04 = false;
        List list = ((C28779CnB) this.A06).A00.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C14360o3.A0K(((Reference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.A04;
        if (z) {
            return this.A0A;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28857CoR(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28852CoM(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28853CoN(i, i2));
            return true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.DiP] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.A04;
        if (z) {
            A00(this, new Object());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C5C3 c5c3 = this.A02;
        return TextUtils.getCapsMode(c5c3.A01.A00, C5C2.A01(c5c3.A00), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        C5C3 c5c3 = this.A02;
        long j = c5c3.A00;
        if (C5C2.A03(j)) {
            return null;
        }
        return c5c3.A01.subSequence(C5C2.A01(j), C5C2.A00(j)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC28018CWq.A00(this.A02, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC28018CWq.A01(this.A02, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2;
        boolean z = this.A04;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    A00(this, new C28856CoQ(0, this.A02.A01.A00.length()));
                    return false;
                case R.id.cut:
                    i2 = 277;
                    break;
                case R.id.copy:
                    i2 = 278;
                    break;
                case R.id.paste:
                    i2 = 279;
                    break;
            }
            sendKeyEvent(new KeyEvent(0, i2));
            sendKeyEvent(new KeyEvent(1, i2));
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.A04;
        if (z) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        android.util.Log.w("RecordingIC", AnonymousClass001.A0O("IME sends unsupported Editor Action: ", i));
                        break;
                }
                ((C28779CnB) this.A06).A00.A08.invoke(new ImeAction(i2));
                return true;
            }
            i2 = 1;
            ((C28779CnB) this.A06).A00.A08.invoke(new ImeAction(i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC28288Cda.A00(handwritingGesture, this.A05, this.A07, this.A08, executor, intConsumer, DRU.A00(this, 14));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC28288Cda.A02(cancellationSignal, previewableHandwritingGesture, this.A05, this.A07);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.A04;
        if (z4) {
            boolean z5 = false;
            boolean A1M = AbstractC167007dF.A1M(i & 1);
            boolean A1M2 = AbstractC167007dF.A1M(i & 2);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                z = AbstractC167007dF.A1M(i & 16);
                z2 = AbstractC167007dF.A1M(i & 8);
                z3 = AbstractC167007dF.A1M(i & 4);
                if (i2 >= 34 && (i & 32) != 0) {
                    z5 = true;
                }
                if (!z && !z2 && !z3 && !z5) {
                    z5 = false;
                    z = true;
                    z2 = true;
                    z3 = true;
                    if (i2 >= 34) {
                        z5 = true;
                    }
                }
            } else {
                z = true;
                z2 = true;
                z3 = false;
            }
            C28190Cbe c28190Cbe = ((C28779CnB) this.A06).A00.A0B;
            synchronized (c28190Cbe.A0B) {
                c28190Cbe.A08 = z;
                c28190Cbe.A06 = z2;
                c28190Cbe.A07 = z3;
                c28190Cbe.A09 = z5;
                if (A1M) {
                    c28190Cbe.A05 = true;
                    if (c28190Cbe.A04 != null) {
                        C28190Cbe.A00(c28190Cbe);
                    }
                }
                c28190Cbe.A0A = A1M2;
            }
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.A04;
        if (z) {
            ((BaseInputConnection) ((C28779CnB) this.A06).A00.A0C.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28854CoO(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28855CoP(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C28856CoQ(i, i2));
            return true;
        }
        return z;
    }

    public InputConnectionC28692Cle(CWQ cwq, InterfaceC30780DgH interfaceC30780DgH, BXF bxf, C59J c59j, C5C3 c5c3, boolean z) {
        this.A06 = interfaceC30780DgH;
        this.A0A = z;
        this.A05 = cwq;
        this.A07 = bxf;
        this.A08 = c59j;
        this.A02 = c5c3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return A01();
    }
}
