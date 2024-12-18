package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Miq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51147Miq extends C2UU {
    public List A00 = C16930sl.A00;
    public InterfaceC16660sJ A01;
    public final UserSession A02;
    public final EnumC53114NeR A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO c3oo;
        C14360o3.A0B(viewGroup, 0);
        UserSession userSession = this.A02;
        EnumC53114NeR enumC53114NeR = this.A03;
        C09530e4 c09530e4 = (C09530e4) AbstractC001800i.A0O(AbstractC51358MmJ.A00, i);
        if (c09530e4 != null && (c3oo = (C3OO) ((InterfaceC16610sE) c09530e4.A01).invoke(viewGroup, enumC53114NeR, userSession)) != null) {
            return c3oo;
        }
        AbstractC12120kG.A07("BottomSheetListVewItemViewHolder", AnonymousClass001.A0O("view type not found: ", i), null);
        return new NHY(viewGroup, userSession);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC51358MmJ abstractC51358MmJ = (AbstractC51358MmJ) c3oo;
        C14360o3.A0B(abstractC51358MmJ, 0);
        InterfaceC58034PoK interfaceC58034PoK = (InterfaceC58034PoK) AbstractC001800i.A0O(this.A00, i);
        if (interfaceC58034PoK != null) {
            abstractC51358MmJ.A00(interfaceC58034PoK, this.A01);
        }
    }

    public C51147Miq(UserSession userSession, EnumC53114NeR enumC53114NeR) {
        this.A02 = userSession;
        this.A03 = enumC53114NeR;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1778710676);
        int size = this.A00.size();
        C0f9.A0A(-274971299, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-1643048839);
        Object A0O = AbstractC001800i.A0O(this.A00, i);
        if (A0O != null) {
            List list = AbstractC51358MmJ.A00;
            i2 = -1;
            int i4 = 0;
            if (A0O instanceof C51827MvV) {
                Iterator it = AbstractC51358MmJ.A00.iterator();
                while (it.hasNext()) {
                    if (!MSY.A1W(NHY.class, AbstractC43592JPx.A17(it).A00)) {
                        i4++;
                    } else {
                        i2 = i4;
                        break;
                    }
                }
                i3 = -65980629;
            } else if (A0O instanceof C51829MvX) {
                Iterator it2 = AbstractC51358MmJ.A00.iterator();
                while (it2.hasNext()) {
                    if (!MSY.A1W(NHZ.class, AbstractC43592JPx.A17(it2).A00)) {
                        i4++;
                    } else {
                        i2 = i4;
                        break;
                    }
                }
                i3 = -65980629;
            } else if (A0O instanceof C51828MvW) {
                Iterator it3 = AbstractC51358MmJ.A00.iterator();
                while (it3.hasNext()) {
                    if (!MSY.A1W(C52405NHa.class, AbstractC43592JPx.A17(it3).A00)) {
                        i4++;
                    } else {
                        i2 = i4;
                        break;
                    }
                }
                i3 = -65980629;
            } else if (A0O instanceof C51830MvY) {
                Iterator it4 = AbstractC51358MmJ.A00.iterator();
                while (it4.hasNext()) {
                    if (!MSY.A1W(NHW.class, AbstractC43592JPx.A17(it4).A00)) {
                        i4++;
                    } else {
                        i2 = i4;
                        break;
                    }
                }
                i3 = -65980629;
            } else if (A0O instanceof C51826MvU) {
                Iterator it5 = AbstractC51358MmJ.A00.iterator();
                while (it5.hasNext()) {
                    if (!MSY.A1W(NHX.class, AbstractC43592JPx.A17(it5).A00)) {
                        i4++;
                    } else {
                        i2 = i4;
                        break;
                    }
                }
                i3 = -65980629;
            } else {
                throw B4Z.A00();
            }
        } else {
            i2 = -1;
            i3 = 718980677;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
