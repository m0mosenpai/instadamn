package X;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.gallery.GalleryView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.JkF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44420JkF extends BaseAdapter implements InterfaceC195538kt, InterfaceC195548ku, MQJ {
    public C55057OaC A00;
    public ConcurrentHashMap A01;
    public List A02;
    public final L0R A03;
    public final HashMap A04;
    public final HashMap A05;
    public final java.util.Set A06;
    public final boolean A07;
    public final InterfaceC11380iw A08;
    public final C8SF A09;

    public C44420JkF(C8SF c8sf, L0R l0r) {
        C14360o3.A0B(l0r, 2);
        this.A09 = c8sf;
        this.A03 = l0r;
        this.A04 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        this.A02 = AbstractC166987dD.A1E();
        this.A06 = AbstractC31171DnF.A0l();
        this.A08 = AbstractC31171DnF.A0D("DirectGalleryGridAdapter");
        this.A07 = AbstractC14490oL.A0E(l0r.A00);
        this.A01 = new ConcurrentHashMap();
    }

    public final Integer A02(GalleryItem galleryItem) {
        C14360o3.A0B(galleryItem, 0);
        C55057OaC c55057OaC = this.A00;
        if (c55057OaC != null) {
            int i = 0;
            Iterator it = c55057OaC.A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(it.next(), galleryItem)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final void A03(ArrayList arrayList) {
        HashMap hashMap = this.A04;
        hashMap.clear();
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            C55057OaC c55057OaC = (C55057OaC) AbstractC166997dE.A0l(A13);
            String str = c55057OaC.A01;
            hashMap.put(str, c55057OaC);
            C55057OaC c55057OaC2 = this.A00;
            if (c55057OaC2 != null && C14360o3.A0K(c55057OaC2.A01, str)) {
                A00(this, c55057OaC);
            }
        }
        if (this.A00 == null && !hashMap.isEmpty()) {
            A00(this, (C55057OaC) arrayList.get(0));
        }
        C0fA.A00(this, -2023625151);
    }

    @Override // X.InterfaceC195548ku
    public final int Brg(int i) {
        return i;
    }

    @Override // X.MQJ
    public final void DNN(C9BB c9bb, GalleryItem galleryItem) {
        int indexOf;
        Integer valueOf;
        C14360o3.A0B(galleryItem, 0);
        if (!A01(galleryItem)) {
            if (galleryItem.A09 == C05F.A0N) {
                MQI mqi = this.A03.A01.A0F;
                if (mqi != null) {
                    mqi.DmP(galleryItem, -1, c9bb.A02);
                    return;
                }
                return;
            }
            C55057OaC c55057OaC = this.A00;
            if (c55057OaC == null || (valueOf = Integer.valueOf((indexOf = c55057OaC.A02.indexOf(galleryItem)))) == null || indexOf < 0) {
                return;
            }
            GalleryView galleryView = this.A03.A01;
            if (galleryView.A0H) {
                valueOf = Integer.valueOf(indexOf + 1);
            }
            int intValue = valueOf.intValue();
            GalleryView.A03(galleryItem, galleryView, Integer.valueOf(intValue));
            MQI mqi2 = galleryView.A0F;
            if (mqi2 == null) {
                return;
            }
            mqi2.DmP(galleryItem, intValue, c9bb.A02);
        }
    }

    @Override // X.MQJ
    public final boolean DNX(View view, C9BB c9bb, GalleryItem galleryItem) {
        MQI mqi;
        InterfaceC50495MQy interfaceC50495MQy;
        Integer num;
        boolean A1R = AbstractC167007dF.A1R(0, view, galleryItem);
        if (A01(galleryItem) || (mqi = this.A03.A01.A0F) == null) {
            return false;
        }
        C49652Lwj c49652Lwj = (C49652Lwj) mqi;
        if (galleryItem.A09 == C05F.A0N) {
            InterfaceC50495MQy interfaceC50495MQy2 = c49652Lwj.A00.A08;
            if (interfaceC50495MQy2 == null) {
                return false;
            }
            interfaceC50495MQy2.D2F();
        } else {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                C47958LGu c47958LGu = c49652Lwj.A00;
                UserSession userSession = c47958LGu.A05;
                AbstractC208329Jr.A02(new LXR(), remoteMedia, userSession, C05F.A01, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC166987dD.A1E(), A1R);
                Context context = c47958LGu.A04;
                C195398kf c195398kf = c47958LGu.A06;
                C14360o3.A0B(c195398kf, 2);
                c195398kf.A03(context, remoteMedia, userSession, null, new C30184DRp(33, remoteMedia, context, userSession), new C57746PjZ(context, 29));
                interfaceC50495MQy = c47958LGu.A08;
            } else {
                if (galleryItem.A00 == null) {
                    return false;
                }
                C47958LGu c47958LGu2 = c49652Lwj.A00;
                LI5.A00(KQ0.A00, AbstractC46750Km7.A00(c47958LGu2.A05));
                if (c47958LGu2.A0A.A0F) {
                    GalleryView galleryView = c47958LGu2.A03;
                    if (galleryView == null) {
                        C14360o3.A0F("galleryView");
                        throw C00O.createAndThrow();
                    }
                    if (galleryView.A02 == 0 || galleryView.A03 == 0) {
                        c47958LGu2.A04();
                        if (galleryView.A02 == 0) {
                            C47958LGu.A00(c47958LGu2);
                        } else {
                            galleryView.setMaxMultiSelectCount(0);
                        }
                        C44420JkF c44420JkF = galleryView.A0C;
                        if (c44420JkF != null) {
                            num = c44420JkF.A02(galleryItem);
                        } else {
                            num = null;
                        }
                        GalleryView.A03(galleryItem, galleryView, num);
                    }
                } else {
                    interfaceC50495MQy = c47958LGu2.A08;
                }
            }
            if (interfaceC50495MQy == null || interfaceC50495MQy.DIy(view, galleryItem) != A1R) {
                return false;
            }
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public static final void A00(C44420JkF c44420JkF, C55057OaC c55057OaC) {
        String str;
        int i;
        GalleryItem galleryItem;
        c44420JkF.A00 = c55057OaC;
        List list = c44420JkF.A02;
        list.clear();
        L0R l0r = c44420JkF.A03;
        GalleryView galleryView = l0r.A01;
        if (galleryView.A0L && c55057OaC != null) {
            C55057OaC c55057OaC2 = c44420JkF.A00;
            if (c55057OaC2 != null) {
                i = c55057OaC2.A02.size();
            } else {
                i = 0;
            }
            C17v A0B = C17s.A0B(C17s.A0C(0, i), 3);
            int i2 = A0B.A00;
            int i3 = A0B.A01;
            int i4 = A0B.A02;
            if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                while (true) {
                    C55057OaC c55057OaC3 = c44420JkF.A00;
                    if (c55057OaC3 != null && (galleryItem = (GalleryItem) c55057OaC3.A02.get(i2)) != null) {
                        Context context = l0r.A00;
                        Date date = new Date(LIK.A00.A01(galleryItem));
                        SimpleDateFormat simpleDateFormat = AbstractC195798lM.A01;
                        list.add(AbstractC195798lM.A00(AbstractC166997dE.A0p(context, 2131975643), AbstractC166997dE.A0p(context, 2131977167), null, date));
                    }
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 += i4;
                    }
                }
            }
        }
        C44503Jm9 c44503Jm9 = galleryView.A0D;
        if (c44503Jm9 != null) {
            c44503Jm9.A03.Egh(c55057OaC);
            C55057OaC c55057OaC4 = (C55057OaC) c44503Jm9.A03.getValue();
            if (c55057OaC4 != null && (str = c55057OaC4.A00) != null) {
                c44503Jm9.A02.A05(str, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null);
            }
        }
    }

    private final boolean A01(GalleryItem galleryItem) {
        L0R l0r = this.A03;
        UserSession userSession = l0r.A01.A07;
        Context context = l0r.A00;
        if (userSession != null) {
            boolean A04 = galleryItem.A04();
            boolean A06 = galleryItem.A06();
            int A00 = LIK.A00(galleryItem);
            if (A04 && A06 && WGT.A07(userSession, A00)) {
                InterfaceC11380iw interfaceC11380iw = this.A08;
                AbstractC167017dG.A1N(userSession, interfaceC11380iw);
                AbstractC208329Jr.A09(interfaceC11380iw, userSession, "invalid_media_selected", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null);
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131956281);
                String A0p = AbstractC166997dE.A0p(context, 2131956280);
                A0I.A0a(new DialogInterfaceOnClickListenerC35455FkC(context, userSession, 12), AbstractC166997dE.A0p(context, 2131956278), A0p);
                A0I.A04();
                AbstractC31176DnK.A16(null, A0I, 2131956279);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC195538kt
    public final int AK4(int i) {
        return i / this.A03.A01.A01;
    }

    @Override // X.InterfaceC195538kt
    public final int AK8(int i) {
        return i * this.A03.A01.A01;
    }

    @Override // X.InterfaceC195538kt
    public final int Bph() {
        C55057OaC c55057OaC = this.A00;
        int i = 0;
        if (c55057OaC != null && c55057OaC.A02.size() != 0) {
            i = c55057OaC.A02.size() / this.A03.A01.A01;
        }
        if (this.A03.A01.A0H) {
            return i + 1;
        }
        return i;
    }

    @Override // X.InterfaceC195548ku
    public final List Brl() {
        return this.A02;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i;
        C55057OaC c55057OaC = this.A00;
        if (c55057OaC != null) {
            i = c55057OaC.A02.size();
        } else {
            i = 0;
        }
        if (this.A03.A01.A0H) {
            return i + 1;
        }
        return i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list;
        if (this.A03.A01.A0H) {
            if (i == 0) {
                return new GalleryItem(null, null, null, null, null, null, null, null, C05F.A0N, AbstractC167017dG.A0j(), -1);
            }
            C55057OaC c55057OaC = this.A00;
            if (c55057OaC != null) {
                list = c55057OaC.A02;
                i--;
                return list.get(i);
            }
            return null;
        }
        C55057OaC c55057OaC2 = this.A00;
        if (c55057OaC2 != null) {
            list = c55057OaC2.A02;
            return list.get(i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        if (r3 != null) goto L67;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44420JkF.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
