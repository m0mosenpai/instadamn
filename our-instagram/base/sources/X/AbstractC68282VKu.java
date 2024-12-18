package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import java.util.ArrayDeque;

/* renamed from: X.VKu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68282VKu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        AbstractC10360h2 abstractC10360h2;
        String str3;
        C6FG c6fg = c6fq.A03;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 1);
        if (c6fg == null) {
            str3 = AbstractC111324zv.A00(1836);
        } else {
            ArrayDeque arrayDeque = VZQ.A00;
            if (arrayDeque.size() > 0) {
                DialogInterface dialogInterface = (DialogInterface) AbstractC001800i.A0C(arrayDeque);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return null;
                }
            } else {
                int hashCode = A0e.hashCode();
                switch (hashCode) {
                    case -441950736:
                        str = "targeted";
                        break;
                    case 115029:
                        str = "top";
                        break;
                    case 104069805:
                        str = "modal";
                        break;
                    default:
                        str3 = "Failed to find a static binding implementation.";
                        break;
                }
                if (A0e.equals(str)) {
                    ?? r7 = 0;
                    if (A0F != null) {
                        boolean A0S = A0F.A0S(36, false);
                        str2 = A0F.A0E();
                        r7 = A0S;
                    } else {
                        str2 = null;
                    }
                    RunnableC71403WtR runnableC71403WtR = new RunnableC71403WtR(c6fq, A0F);
                    switch (hashCode) {
                        case -441950736:
                            if (A0e.equals("targeted")) {
                                if (str2 != null) {
                                    C189478aR A06 = AbstractC70200WGp.A06(c6fg);
                                    if (A06 != null) {
                                        AbstractC10360h2 childFragmentManager = A06.A03.getChildFragmentManager();
                                        C14360o3.A07(childFragmentManager);
                                        int A0L = childFragmentManager.A0L();
                                        for (int i = 0; i < A0L; i++) {
                                            String str4 = ((AbstractC016706m) childFragmentManager.A0S(i)).A09;
                                            if (str4 != null && str4.equals(str2)) {
                                                C189478aR A062 = AbstractC70200WGp.A06(c6fg);
                                                if (A062 == 0) {
                                                    AbstractC25241Le.A02("BloksBottomSheetHelper", AbstractC111324zv.A00(600));
                                                } else {
                                                    A062.A0N(str2, r7);
                                                }
                                                runnableC71403WtR.run();
                                                return null;
                                            }
                                        }
                                    }
                                    AbstractC10360h2 abstractC10360h22 = (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager);
                                    if (abstractC10360h22 != null && abstractC10360h22.A0Q(str2) != null) {
                                        AbstractC70200WGp.A0D(c6fg, null);
                                        AbstractC10360h2 abstractC10360h23 = (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager);
                                        if (abstractC10360h23 != 0) {
                                            abstractC10360h23.A0x(str2, r7);
                                        }
                                        runnableC71403WtR.run();
                                        return null;
                                    }
                                }
                            }
                            break;
                        case 115029:
                            if (A0e.equals("top")) {
                                C189478aR A063 = AbstractC70200WGp.A06(c6fg);
                                if (A063 != null) {
                                    if (A063.A03.A0D.size() > 1) {
                                        C189478aR A064 = AbstractC70200WGp.A06(c6fg);
                                        if (A064 == null) {
                                            AbstractC25241Le.A02("BloksBottomSheetHelper", AbstractC111324zv.A00(600));
                                        } else {
                                            A064.A08();
                                        }
                                    } else {
                                        AbstractC70200WGp.A0D(c6fg, runnableC71403WtR);
                                        return null;
                                    }
                                } else {
                                    AbstractC70132W6e.A00(C6BQ.A03(c6fg), (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager));
                                }
                                runnableC71403WtR.run();
                                return null;
                            }
                            break;
                        case 104069805:
                            if (A0e.equals("modal")) {
                                C189478aR A065 = AbstractC70200WGp.A06(c6fg);
                                if (A065 != null) {
                                    A065.A07();
                                } else {
                                    AbstractC10360h2 abstractC10360h24 = (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager);
                                    int A0L2 = abstractC10360h24.A0L() - 1;
                                    while (true) {
                                        if (-1 < A0L2) {
                                            String str5 = ((AbstractC016706m) abstractC10360h24.A0S(A0L2)).A09;
                                            Fragment A0Q = abstractC10360h24.A0Q(str5);
                                            if (!(A0Q instanceof C72743Nv) || A0Q == null || !C14360o3.A0K(U6u.A04(((C72743Nv) A0Q).A09.A0P), "modal")) {
                                                A0L2--;
                                            } else if (str5 != null && (abstractC10360h2 = (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager)) != null) {
                                                abstractC10360h2.A0x(str5, 1);
                                            }
                                        }
                                    }
                                }
                                runnableC71403WtR.run();
                                return null;
                            }
                            break;
                    }
                    throw AbstractC65702TsY.A0S(A0e);
                }
                str3 = "Failed to find a static binding implementation.";
            }
            return null;
        }
        AbstractC25241Le.A02("BKBloksActionScreenCloseScreenImpl", str3);
        return null;
    }
}
