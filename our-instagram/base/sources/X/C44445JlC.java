package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JlC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44445JlC extends AbstractC10330gz {
    public int A00;
    public List A01;
    public final SparseArray A02;
    public final UserSession A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44445JlC(AbstractC10360h2 abstractC10360h2, UserSession userSession, String str) {
        super(abstractC10360h2, 0);
        C14360o3.A0B(userSession, 2);
        this.A03 = userSession;
        this.A04 = str;
        this.A01 = C16930sl.A00;
        this.A02 = new SparseArray();
        this.A00 = -1;
    }

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        Bundle bundle;
        C14360o3.A0B(obj, 0);
        int i = 0;
        if (!(obj instanceof KC0)) {
            if ((obj instanceof C45485KBz) && (bundle = ((Fragment) obj).mArguments) != null) {
                String string = bundle.getString("category_id_key");
                int size = this.A01.size();
                while (i < size) {
                    boolean A0K = C14360o3.A0K(((C9CD) this.A01.get(i)).A02, string);
                    i++;
                    if (A0K) {
                        if (i < 0) {
                            return -2;
                        }
                    }
                }
                return -2;
            }
            return -2;
        }
        if (i < this.A02.size()) {
            return i;
        }
        return -2;
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C14360o3.A0C(instantiateItem, AbstractC111324zv.A00(29));
        InterfaceC08430c6 interfaceC08430c6 = (Fragment) instantiateItem;
        this.A02.put(i, interfaceC08430c6);
        if (i == this.A00) {
            ((InterfaceC50489MQr) interfaceC08430c6).DXZ();
        }
        return interfaceC08430c6;
    }

    @Override // X.AbstractC10330gz
    public final Fragment A00(int i) {
        String str;
        String str2;
        Fragment c45485KBz;
        Bundle A0b;
        if (i == 0) {
            str = this.A03.token;
            str2 = this.A04;
            C14360o3.A0B(str, 0);
            c45485KBz = new KC0();
            A0b = AbstractC166987dD.A0b();
        } else {
            String str3 = ((C9CD) this.A01.get(i - 1)).A02;
            str = this.A03.token;
            str2 = this.A04;
            AbstractC167017dG.A1O(str3, str);
            c45485KBz = new C45485KBz();
            A0b = AbstractC166987dD.A0b();
            A0b.putString("category_id_key", str3);
            A0b.putInt("category_index_key", i);
        }
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        A0b.putString("surface", str2);
        c45485KBz.setArguments(A0b);
        return c45485KBz;
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        int size = this.A01.size();
        if (AbstractC166987dD.A1b(this.A01)) {
            return size + 1;
        }
        return size;
    }

    @Override // X.AbstractC021208i
    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return "";
        }
        return ((C9CD) this.A01.get(i - 1)).A01;
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        this.A02.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }
}
