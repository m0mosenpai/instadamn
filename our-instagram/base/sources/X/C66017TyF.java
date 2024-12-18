package X;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.creation.photo.util.ExifImageData;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.TyF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66017TyF extends C2UU implements BBz {
    public static final InterfaceC08100bW A0B = new C1QF("IgSecureUriParser").A00;
    public final FragmentActivity A02;
    public final UserSession A04;
    public final U7M A05;
    public final InterfaceC71977XDk A06;
    public final C8IW A07;
    public final InterfaceC08830cm A0A;
    public final LinkedList A08 = new LinkedList();
    public final Map A09 = new HashMap();
    public final C2GS A03 = new C2GS();
    public C66486UJo A00 = null;
    public boolean A01 = false;

    @Override // X.BBz
    public final boolean DNb(int i, int i2) {
        LinkedList linkedList = this.A08;
        linkedList.add(i2, linkedList.remove(i));
        notifyItemMoved(i, i2);
        return true;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AiI aiI;
        C66486UJo c66486UJo = (C66486UJo) c3oo;
        AAF aaf = (AAF) this.A08.get(i);
        this.A02.getLifecycle().A09(c66486UJo);
        if (this.A06.CSU()) {
            aiI = new AiI(c66486UJo, this, aaf);
        } else {
            aiI = null;
        }
        aaf.getClass();
        Map map = this.A09;
        C69105Vhv c69105Vhv = new C69105Vhv(c66486UJo, this, aaf);
        c66486UJo.A04 = null;
        LayoutImageView layoutImageView = c66486UJo.A0G;
        layoutImageView.setTranslationY(0.0f);
        layoutImageView.setTranslationX(0.0f);
        layoutImageView.A0I();
        layoutImageView.A01 = true;
        c66486UJo.A03();
        layoutImageView.setVisibility(8);
        TextureView textureView = c66486UJo.A01;
        if (textureView != null) {
            textureView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = c66486UJo.A09;
        C56302iJ c56302iJ = aaf.A02;
        constraintLayout.setLayoutParams(c56302iJ);
        C195868lW c195868lW = aaf.A05;
        int i2 = 0;
        if (c195868lW != null) {
            c66486UJo.A02 = c195868lW;
            c66486UJo.A04 = c195868lW.A0k;
            if (c66486UJo.A01 == null) {
                FragmentActivity fragmentActivity = c66486UJo.A0A;
                C14360o3.A0B(fragmentActivity, 1);
                TextureView textureView2 = new TextureView(fragmentActivity);
                if (aiI != null) {
                    U7F u7f = new U7F();
                    u7f.A00 = 1.0f;
                    u7f.A01 = new GestureDetector(textureView2.getContext(), new C44406Jjj(aiI, 7));
                    u7f.A02 = new C48578LeG(aiI, 0);
                    textureView2.setOnTouchListener(u7f);
                }
                c66486UJo.A01 = textureView2;
                textureView2.setSurfaceTextureListener(new WL4(c66486UJo));
                constraintLayout.addView(c66486UJo.A01, 0);
            }
            TextureView textureView3 = c66486UJo.A01;
            textureView3.getClass();
            textureView3.setVisibility(0);
            c66486UJo.A01.setLayoutParams(c56302iJ);
            c66486UJo.A01.setTransform(aaf.A01);
            C66486UJo.A00(c66486UJo);
        } else {
            if (aiI != null) {
                layoutImageView.A00 = aiI;
            }
            String str = aaf.A06;
            if (str != null) {
                C44262Jh8 c44262Jh8 = (C44262Jh8) map.get(str);
                C22918A8o c22918A8o = aaf.A04;
                int i3 = (int) c22918A8o.A03;
                int i4 = (int) c22918A8o.A00;
                if (c44262Jh8 != null) {
                    layoutImageView.setVisibility(0);
                    layoutImageView.setLayoutParams(c56302iJ);
                    FragmentActivity fragmentActivity2 = c66486UJo.A0A;
                    Bitmap bitmap = c44262Jh8.A00;
                    ExifImageData exifImageData = c44262Jh8.A01;
                    if (exifImageData != null) {
                        i2 = exifImageData.A00;
                    }
                    InterfaceC197178nn interfaceC197178nn = c44262Jh8.A02;
                    if (bitmap == null) {
                        C9GR.A0F(fragmentActivity2, AbstractC43591JPw.A00(219), 2131976043);
                        return;
                    } else {
                        if (fragmentActivity2 == null || fragmentActivity2.isFinishing() || interfaceC197178nn == null) {
                            return;
                        }
                        layoutImageView.A0P(i3, i4, bitmap, i2);
                        return;
                    }
                }
                AbstractC018607g.A00(c66486UJo.A0A).A04(new WR4(c69105Vhv, c66486UJo, str, i3, i4), c66486UJo.A06);
            }
            Bitmap bitmap2 = aaf.A00;
            if (bitmap2 == null) {
                AbstractC12120kG.A01("LayoutCaptureGridAdapter", "both image bitmap and video are null");
            } else {
                layoutImageView.setVisibility(0);
                View view = c66486UJo.A07;
                view.setVisibility(0);
                bitmap2.getHeight();
                bitmap2.getWidth();
                layoutImageView.A0Q(bitmap2, 0);
                layoutImageView.A0O();
                layoutImageView.setLayoutParams(c56302iJ);
                AbstractC31172DnG.A1B(c66486UJo.A0A, view, R.color.design_dark_default_color_on_background);
                layoutImageView.setImageRotateBitmapResetBase(new C44264JhA(bitmap2, 0), null, c56302iJ);
                view.setVisibility(0);
                view.animate().cancel();
                view.setAlpha(0.25f);
                view.animate().alpha(0.0f).setDuration(500L).start();
            }
        }
        C0fQ.A00(new ViewOnClickListenerC23249ASk(c69105Vhv, 21), c66486UJo.A0D);
        C66486UJo.A02(c66486UJo, aaf);
        WNX.A00(c66486UJo.A08, c66486UJo, c69105Vhv, aaf, 25);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_format_capture_itemview);
        FragmentActivity fragmentActivity = this.A02;
        C8IW c8iw = this.A07;
        return new C66486UJo(A0A, fragmentActivity, this.A04, this.A05, c8iw, this.A0A);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        C2GS c2gs = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c2gs.A09(((C66486UJo) c3oo).A0B);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C3OO c3oo) {
        C2GS c2gs = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c2gs.A08(((C66486UJo) c3oo).A0B);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C66486UJo c66486UJo = (C66486UJo) c3oo;
        if (c66486UJo.A04 == null) {
            c66486UJo.A0G.setImageBitmap(null);
        } else {
            C66486UJo.A01(c66486UJo);
            C195868lW c195868lW = c66486UJo.A02;
            c195868lW.getClass();
            if (!c195868lW.A18) {
                new File(c66486UJo.A02.A0k).delete();
            }
        }
        c66486UJo.A08.setOnClickListener(null);
        c66486UJo.A0D.setOnClickListener(null);
        if (c66486UJo == this.A00) {
            this.A00 = null;
        }
    }

    public C66017TyF(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC71977XDk interfaceC71977XDk, InterfaceC08830cm interfaceC08830cm) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A06 = interfaceC71977XDk;
        this.A0A = interfaceC08830cm;
        C8IW c8iw = (C8IW) new C52942bb(fragment).A00(C8IW.class);
        this.A07 = c8iw;
        this.A05 = new U7M((AudioManager) fragmentActivity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        c8iw.A03.A06(fragment.getViewLifecycleOwner(), new C70303WQi(this, 39));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1574622700);
        int size = this.A08.size();
        C0f9.A0A(319709765, A03);
        return size;
    }
}
