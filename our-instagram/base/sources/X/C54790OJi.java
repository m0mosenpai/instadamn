package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.util.creation.RenderBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.OJi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54790OJi {
    public C178577wV A00;
    public C54665OCr A01;
    public final Context A02;
    public final Handler A04;
    public final UserSession A05;
    public volatile boolean A08;
    public final Handler A03 = AbstractC167007dF.A0J();
    public final List A07 = new LinkedList();
    public final Runnable A06 = new Runnable() { // from class: X.PLc
        @Override // java.lang.Runnable
        public final void run() {
            C178577wV c178577wV = C54790OJi.this.A00;
            if (c178577wV != null) {
                c178577wV.A05();
            }
        }
    };

    public final void A00(List list) {
        if (!this.A08) {
            synchronized (this) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C54628OBd c54628OBd = (C54628OBd) it.next();
                    boolean z = false;
                    List list2 = this.A07;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C54628OBd c54628OBd2 = (C54628OBd) it2.next();
                        if (c54628OBd2.A00 == c54628OBd.A00 && !c54628OBd2.A03.get()) {
                            z = true;
                            break;
                        }
                    }
                    list2.add(c54628OBd);
                    if (z) {
                        it.remove();
                    }
                }
            }
            if (!list.isEmpty()) {
                final ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C54628OBd c54628OBd3 = (C54628OBd) it3.next();
                    A1E.add(new C54598O9z(c54628OBd3.A02, c54628OBd3.A03, c54628OBd3.A00));
                }
                this.A04.post(new Runnable() { // from class: X.PPv
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C54790OJi c54790OJi = C54790OJi.this;
                        final List list3 = A1E;
                        C178577wV c178577wV = c54790OJi.A00;
                        final C54665OCr c54665OCr = c54790OJi.A01;
                        if (c178577wV != null && c54665OCr != null) {
                            Handler handler = c54790OJi.A04;
                            Runnable runnable = c54790OJi.A06;
                            handler.removeCallbacks(runnable);
                            c178577wV.A06();
                            final InterfaceC57931Pmb interfaceC57931Pmb = new InterfaceC57931Pmb() { // from class: X.OxR
                                @Override // X.InterfaceC57931Pmb
                                public final void EGi(final C54598O9z c54598O9z) {
                                    C54790OJi c54790OJi2 = C54790OJi.this;
                                    synchronized (c54790OJi2) {
                                        if (!c54598O9z.A02.get()) {
                                            Iterator it4 = c54790OJi2.A07.iterator();
                                            while (it4.hasNext()) {
                                                C54628OBd c54628OBd4 = (C54628OBd) it4.next();
                                                if (c54598O9z.A00 == c54628OBd4.A00) {
                                                    final InterfaceC57931Pmb interfaceC57931Pmb2 = c54628OBd4.A01;
                                                    if (interfaceC57931Pmb2 != null && !c54628OBd4.A03.get()) {
                                                        c54790OJi2.A03.post(new Runnable() { // from class: X.PPw
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                interfaceC57931Pmb2.EGi(c54598O9z);
                                                            }
                                                        });
                                                    }
                                                    it4.remove();
                                                }
                                            }
                                        }
                                    }
                                }
                            };
                            c54665OCr.A02.A0C(new Runnable() { // from class: X.PSJ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C54665OCr c54665OCr2 = C54665OCr.this;
                                    List<C54598O9z> list4 = list3;
                                    InterfaceC57931Pmb interfaceC57931Pmb2 = interfaceC57931Pmb;
                                    for (C54598O9z c54598O9z : list4) {
                                        UserSession userSession = c54665OCr2.A03;
                                        C1YQ A00 = C8M4.A00(userSession);
                                        int i = c54598O9z.A00;
                                        PhotoFilter photoFilter = new PhotoFilter(userSession, A00.A01(i), C05F.A00);
                                        if (!ImmutableList.of(1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110).contains(Integer.valueOf(i))) {
                                            photoFilter.A00(100);
                                        }
                                        FilterGroupModel filterGroupModel = c54665OCr2.A04;
                                        filterGroupModel.EUT(photoFilter.A03, 17);
                                        C197368o7 c197368o7 = c54665OCr2.A02;
                                        c197368o7.A07(((FilterGroupModelImpl) filterGroupModel).A02);
                                        C179067xI.A00(c197368o7.A0C, null);
                                        C06090Tz c06090Tz = C06090Tz.A05;
                                        if (C18U.A06(c06090Tz, userSession, 36329152671924259L)) {
                                            Bitmap A002 = c197368o7.A00();
                                            if (A002 != null) {
                                                OEN oen = new OEN(EnumC53116NeT.A02, C05F.A01, c54598O9z.A01, Integer.MAX_VALUE, 1, true, false);
                                                int i2 = c54665OCr2.A00;
                                                AbstractC54877OOp.A01(A002, oen, i2, i2, 75).A02(userSession);
                                            }
                                        } else if (c197368o7.A01() == null) {
                                            int i3 = c54665OCr2.A00;
                                            int readRenderResult = RenderBridge.readRenderResult(i3, i3, 6408, 12);
                                            RenderBridge.mirrorImage(readRenderResult);
                                            String str = c54598O9z.A01;
                                            C14360o3.A0B(userSession, 0);
                                            RenderBridge.saveAndClearCachedImageFull(readRenderResult, str, true, false, 75, C18U.A06(c06090Tz, userSession, 36313278472783729L), false);
                                        }
                                        interfaceC57931Pmb2.EGi(c54598O9z);
                                    }
                                }
                            });
                            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        }
                    }
                });
            }
        }
    }

    public C54790OJi(Context context, UserSession userSession) {
        this.A02 = context;
        this.A05 = userSession;
        Handler BAu = new C178267w0().BAu("Lite-Controller-Thread");
        this.A04 = BAu;
        BAu.post(new Runnable() { // from class: X.PLd
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.7wv] */
            @Override // java.lang.Runnable
            public final void run() {
                C54790OJi c54790OJi = C54790OJi.this;
                Context context2 = c54790OJi.A02;
                UserSession userSession2 = c54790OJi.A05;
                c54790OJi.A00 = AbstractC23039ADv.A01(context2, new Object(), new C178267w0(), userSession2, "instagram_feed_post_capture_blur_icon", "OneCameraImageRenderer-Thread", null, AbstractC167007dF.A1R(0, context2, userSession2), false);
            }
        });
    }
}
