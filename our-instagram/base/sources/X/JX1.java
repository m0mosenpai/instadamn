package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;

/* loaded from: classes8.dex */
public final class JX1 implements InterfaceC13380mO {
    public final int A00;
    public final Object A01;

    public JX1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C13400mQ A00(Handler handler, Object obj, int i) {
        return new C13400mQ(handler, new JX1(obj, i), 300L);
    }

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        String A0Q;
        C44421JkH c44421JkH;
        Object value;
        switch (this.A00) {
            case 2:
                KCK.A03((KCK) this.A01, AbstractC167027dH.A0Q(obj));
                return;
            case 3:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                C46016KYe c46016KYe = ((C9LN) this.A01).A0M;
                if (c46016KYe == null) {
                    return;
                }
                c46016KYe.A01(str, false);
                return;
            case 4:
                String A0Q2 = AbstractC167027dH.A0Q(obj);
                if (A0Q2.length() <= 0) {
                    return;
                }
                C46016KYe c46016KYe2 = (C46016KYe) this.A01;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                c46016KYe2.A09.A04(A0Q2, c46016KYe2.A00);
                c46016KYe2.A00 = -1L;
                return;
            case 5:
                LGU lgu = (LGU) obj;
                C14360o3.A0B(lgu, 0);
                ((C47759L7f) this.A01).A00(lgu);
                return;
            case 6:
                String str2 = (String) obj;
                C14360o3.A0B(str2, 0);
                GiphyClipsBrowserFragment giphyClipsBrowserFragment = (GiphyClipsBrowserFragment) this.A01;
                C44549Jmt c44549Jmt = giphyClipsBrowserFragment.A03;
                if (c44549Jmt == null) {
                    C14360o3.A0F("giphyBrowserViewModel");
                    throw C00O.createAndThrow();
                }
                c44549Jmt.A04(str2);
                RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
                if (recyclerView == null) {
                    return;
                }
                recyclerView.A0n(0);
                return;
            case 7:
                A0Q = AbstractC167027dH.A0Q(obj);
                C44502Jm8 c44502Jm8 = (C44502Jm8) this.A01;
                if (A0Q.length() == 0) {
                    C05A c05a = c44502Jm8.A03;
                    do {
                        value = c05a.getValue();
                    } while (!c05a.AIi(value, MWT.A00((MWT) value, null, null, null, c44502Jm8.A02, 27)));
                    return;
                }
                c44421JkH = c44502Jm8.A01;
                break;
            case 8:
                ((AbstractC47789L8v) this.A01).A01(AbstractC167027dH.A0Q(obj));
                return;
            case 9:
                String A0Q3 = AbstractC167027dH.A0Q(obj);
                C48599Leb c48599Leb = (C48599Leb) this.A01;
                if (A0Q3.equals(c48599Leb.A00)) {
                    return;
                }
                A0Q = AbstractC25228BEl.A1A(A0Q3);
                c48599Leb.A00 = A0Q;
                c44421JkH = c48599Leb.A02;
                break;
            default:
                ((C44213JgH) this.A01).A00.A00();
                return;
        }
        c44421JkH.filter(A0Q);
    }
}
