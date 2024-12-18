package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.8Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189078Yx extends C2AH {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C2AH A01;
    public final Executor A02;
    public final /* synthetic */ C189058Yv A03;

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        C0w9.A07("MediaLoaderController", exc);
        InterfaceC188988Yo interfaceC188988Yo = this.A03.A09.A0C;
        if (interfaceC188988Yo != null) {
            interfaceC188988Yo.DEP(exc);
        }
        C2AH c2ah = this.A01;
        if (c2ah != null) {
            c2ah.onFail(exc);
        }
    }

    public C189078Yx(C2AH c2ah, C189058Yv c189058Yv) {
        this.A03 = c189058Yv;
        this.A01 = c2ah;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A02 = newSingleThreadExecutor;
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        C2AH c2ah = this.A01;
        if (c2ah != null) {
            c2ah.onFinish();
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        C2AH c2ah = this.A01;
        if (c2ah != null) {
            c2ah.onStart();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        C189368aD c189368aD = (C189368aD) obj;
        C14360o3.A0B(c189368aD, 0);
        final C189058Yv c189058Yv = this.A03;
        boolean z = c189058Yv.A0C;
        final List<Medium> list2 = c189368aD.A01;
        final int i = c189368aD.A00;
        if (z) {
            final LinkedHashMap A00 = C189058Yv.A00(c189058Yv);
            this.A02.execute(new Runnable(this) { // from class: X.8gp
                public final /* synthetic */ C189078Yx A01;

                {
                    this.A01 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    List list3;
                    final List<C9ZK> list4;
                    Integer num;
                    final C189058Yv c189058Yv2 = c189058Yv;
                    InterfaceC189068Yw interfaceC189068Yw = c189058Yv2.A00;
                    if (interfaceC189068Yw == null || (list3 = interfaceC189068Yw.ANA()) == null) {
                        list3 = C16930sl.A00;
                    }
                    final ArrayList arrayList = new ArrayList(list3);
                    final int size = arrayList.size();
                    List list5 = list2;
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        C189058Yv.A02((Medium) it.next(), c189058Yv2, A00);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            GalleryItem galleryItem = (GalleryItem) it2.next();
                            if (galleryItem.A02() && AbstractC001800i.A0u(list5, galleryItem.A00)) {
                                it2.remove();
                            }
                        }
                    }
                    final C17050sx A01 = AbstractC09440dt.A01(new C9F7(30, list5, c189058Yv2));
                    C189028Ys c189028Ys = c189058Yv2.A09;
                    if (c189028Ys.A0H && ((Boolean) A01.getValue()).booleanValue()) {
                        InterfaceC189018Yr interfaceC189018Yr = c189028Ys.A0D;
                        if (interfaceC189018Yr != null) {
                            UserSession userSession = c189058Yv2.A08;
                            if (userSession != null) {
                                num = AbstractC195758lG.A00(userSession);
                            } else {
                                num = C05F.A00;
                            }
                            list4 = interfaceC189018Yr.C3y(num);
                            for (C9ZK c9zk : list4) {
                                List<Medium> list6 = c9zk.A05;
                                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list6, 10));
                                Iterator it3 = list6.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((Medium) it3.next()).A05));
                                }
                                int hashCode = String.valueOf(Arrays.hashCode(new Object[]{arrayList2, c9zk.A02})).hashCode();
                                String str = c9zk.A01;
                                if (str == null) {
                                    str = c9zk.A04;
                                }
                                Folder folder = new Folder(str, c9zk.A03, hashCode, true);
                                for (Medium medium : list6) {
                                    EnumC188968Ym enumC188968Ym = c189028Ys.A08;
                                    if (enumC188968Ym != EnumC188968Ym.A04 || medium.A05() || C14360o3.A0K(medium.A0I, true)) {
                                        if (enumC188968Ym != EnumC188968Ym.A05 || medium.A05()) {
                                            if (enumC188968Ym != EnumC188968Ym.A06 || medium.Cff()) {
                                                C189058Yv.A01(medium, folder);
                                            }
                                        }
                                    }
                                }
                                A00.put(Integer.valueOf(hashCode), folder);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        list4 = null;
                    }
                    final C189078Yx c189078Yx = this.A01;
                    Handler handler = c189078Yx.A00;
                    final Map map = A00;
                    final int i2 = i;
                    handler.post(new Runnable() { // from class: X.8gq
                        @Override // java.lang.Runnable
                        public final void run() {
                            List list7;
                            if (((Boolean) A01.getValue()).booleanValue() && (list7 = list4) != null) {
                                InterfaceC189018Yr interfaceC189018Yr2 = c189058Yv2.A09.A0D;
                                if (interfaceC189018Yr2 != null) {
                                    interfaceC189018Yr2.Dr0(list7);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C189058Yv.A03(c189058Yv2);
                            C189078Yx c189078Yx2 = c189078Yx;
                            for (Folder folder2 : map.values()) {
                                Map map2 = c189078Yx2.A03.A0A;
                                Integer valueOf = Integer.valueOf(folder2.A02);
                                Folder folder3 = (Folder) map2.get(valueOf);
                                if (folder3 != null) {
                                    java.util.Set set = folder3.A05;
                                    set.clear();
                                    java.util.Set set2 = folder3.A06;
                                    set2.clear();
                                    folder3.A01 = null;
                                    folder3.A00 = 0;
                                    set.addAll(folder2.A05);
                                    set2.addAll(folder2.A06);
                                    folder3.A00 = folder2.A00;
                                } else {
                                    map2.put(valueOf, folder2);
                                }
                            }
                            C189058Yv c189058Yv3 = c189078Yx2.A03;
                            Map map3 = c189058Yv3.A0A;
                            C14360o3.A0B(map3, 0);
                            c189058Yv3.A03 = map3;
                            C189078Yx.A00(c189078Yx2, arrayList, size, i2);
                        }
                    });
                }
            });
        } else {
            C189058Yv.A03(c189058Yv);
            InterfaceC189068Yw interfaceC189068Yw = c189058Yv.A00;
            if (interfaceC189068Yw == null || (list = interfaceC189068Yw.ANA()) == null) {
                list = C16930sl.A00;
            }
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (Medium medium : list2) {
                C189058Yv.A02(medium, c189058Yv, c189058Yv.A0A);
                arrayList.remove(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
            }
            A00(this, arrayList, size, i);
        }
        C2AH c2ah = this.A01;
        if (c2ah != null) {
            c2ah.onSuccess(c189368aD);
        }
    }

    public static final void A00(C189078Yx c189078Yx, List list, int i, int i2) {
        InterfaceC189068Yw interfaceC189068Yw;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            if (galleryItem.A02() && (interfaceC189068Yw = c189078Yx.A03.A00) != null) {
                interfaceC189068Yw.EdU(galleryItem, false, false);
            }
        }
        C189058Yv c189058Yv = c189078Yx.A03;
        InterfaceC189068Yw interfaceC189068Yw2 = c189058Yv.A00;
        if (interfaceC189068Yw2 != null) {
            List A01 = c189058Yv.A01.A01();
            String str = c189058Yv.A01.A03;
            if (str == null) {
                str = "";
            }
            interfaceC189068Yw2.EYj(A01, str);
        }
        C189028Ys c189028Ys = c189058Yv.A09;
        InterfaceC188988Yo interfaceC188988Yo = c189028Ys.A0C;
        if (interfaceC188988Yo != null) {
            Object obj = c189058Yv.A0A.get(-1);
            if (obj != null) {
                interfaceC188988Yo.DS1(c189058Yv, ((Folder) obj).A01(), c189058Yv.A01.A01(), i2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (!c189058Yv.A04) {
            c189058Yv.A04 = true;
            Runnable runnable = c189058Yv.A02;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (i != list.size() || !(!c189058Yv.A01.A01().isEmpty()) || !c189028Ys.A0I) {
            return;
        }
        c189058Yv.A0B((Medium) c189058Yv.A01.A01().get(0));
    }
}
