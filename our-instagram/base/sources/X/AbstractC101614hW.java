package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101614hW {
    public static final int A00(IgSimpleImageView igSimpleImageView, IgTextView igTextView, EnumC138556Pl enumC138556Pl, boolean z) {
        C14360o3.A0B(igSimpleImageView, 1);
        switch (enumC138556Pl.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0B(igSimpleImageView, 1, z);
                return 1;
            case 4:
            case 5:
            case 6:
                A0B(igSimpleImageView, 8388611, z);
                return 8388611;
            case 9:
            case 10:
                igSimpleImageView.setVisibility(8);
                if (igTextView != null) {
                    igTextView.setVisibility(8);
                    return 1;
                }
                return 1;
            default:
                throw new RuntimeException();
        }
    }

    public static final MusicOverlayStickerModel A02(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        BEc A09 = A09(drawable);
        if (A09 != null) {
            return A09.BVf();
        }
        throw new IllegalStateException("input param must be a valid music sticker");
    }

    public static final MusicOverlayStickerModel A03(MusicProduct musicProduct, C38321qM c38321qM, Integer num) {
        TrackData trackData;
        MusicAssetModel A00;
        ArrayList arrayList = null;
        if (c38321qM != null) {
            if (c38321qM.A0C.getMusicMetadata() != null) {
                Iterator it = c38321qM.A3N().iterator();
                while (it.hasNext()) {
                    if (((C84823qW) it.next()).A12 == EnumC75383a5.A0s) {
                    }
                }
                C3XR musicMetadata = c38321qM.A0C.getMusicMetadata();
                if (musicMetadata == null) {
                    return null;
                }
                MusicInfo BVc = musicMetadata.BVc();
                if (BVc != null) {
                    trackData = BVc.BVV();
                } else {
                    trackData = null;
                }
                OriginalSoundDataIntf BZw = musicMetadata.BZw();
                if (trackData != null) {
                    A00 = MusicAssetModel.A01(trackData, false);
                } else {
                    if (BZw == null) {
                        return null;
                    }
                    A00 = MusicAssetModel.A00(BZw, false);
                }
                return AbstractC23129AMi.A03(musicProduct, A00, num, "");
            }
            arrayList = c38321qM.A3N();
        }
        return A05(arrayList);
    }

    public static final EnumC138556Pl A08(C23031Ai c23031Ai, boolean z) {
        String string;
        C14360o3.A0B(c23031Ai, 0);
        if (z) {
            InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
            if (interfaceC19630xq.getBoolean(AbstractC111324zv.A00(2895), true)) {
                string = interfaceC19630xq.getString(AbstractC111324zv.A00(2688), "");
                C14360o3.A07(string);
                return A21.A00(string);
            }
        }
        string = c23031Ai.A01.getString(AbstractC111324zv.A00(2740), "");
        C14360o3.A07(string);
        return A21.A00(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BEc A09(Drawable drawable) {
        Object obj;
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C5RO) {
            obj = ((C5RO) drawable).Afg();
        } else {
            boolean z = drawable instanceof C194808jg;
            obj = drawable;
            if (z) {
                Drawable A04 = ((C194808jg) drawable).A04();
                C14360o3.A07(A04);
                obj = A04;
            }
        }
        if (obj instanceof BEc) {
            return (BEc) obj;
        }
        return null;
    }

    public static final boolean A0C(Drawable drawable) {
        EnumC138556Pl enumC138556Pl;
        C14360o3.A0B(drawable, 0);
        BEc A09 = A09(drawable);
        if (A09 != null) {
            enumC138556Pl = A09.BVp();
        } else {
            enumC138556Pl = null;
        }
        if (enumC138556Pl != EnumC138556Pl.A0D) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(List list) {
        C14360o3.A0B(list, 0);
        return A05(list) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MusicProduct A01(Drawable drawable) {
        BEc bEc;
        MusicOverlayStickerModel BVf;
        boolean z = drawable instanceof C5RO;
        Object obj = drawable;
        if (z) {
            C5RO c5ro = (C5RO) drawable;
            obj = drawable;
            if (c5ro != null) {
                Object Afg = c5ro.Afg();
                obj = drawable;
                if (Afg != null) {
                    obj = Afg;
                }
            }
        }
        if (!(obj instanceof BEc) || (bEc = (BEc) obj) == null || (BVf = bEc.BVf()) == null) {
            return null;
        }
        return BVf.A02;
    }

    public static final MusicOverlayStickerModel A05(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C84823qW c84823qW = (C84823qW) it.next();
                if (c84823qW.A12 == EnumC75383a5.A0s) {
                    MusicOverlayStickerModel musicOverlayStickerModel = c84823qW.A0w;
                    if (musicOverlayStickerModel == null) {
                        return c84823qW.A0v;
                    }
                    return musicOverlayStickerModel;
                }
            }
            return null;
        }
        return null;
    }

    public static final ArrayList A0A(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C210489Sn) {
                i = 2736;
            } else if (obj instanceof C210499So) {
                i = 2730;
            } else if (obj instanceof C68074V9e) {
                i = 2732;
            } else if (obj instanceof C68076V9g) {
                i = 2735;
            } else if (obj instanceof C68075V9f) {
                i = 2731;
            } else if (obj instanceof C68073V9d) {
                i = 2733;
            } else if (obj instanceof C68077V9h) {
                i = 2734;
            } else if (obj instanceof C210509Sp) {
                i = 1118;
            } else if (obj instanceof C210519Sq) {
                i = 2737;
            } else {
                throw new IllegalArgumentException("Unhandled Music Sticker Drawable");
            }
            arrayList.add(AbstractC111324zv.A00(i));
        }
        return arrayList;
    }

    public static final void A0B(IgSimpleImageView igSimpleImageView, int i, boolean z) {
        if (z) {
            igSimpleImageView.setVisibility(0);
        }
        int dimensionPixelOffset = igSimpleImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_not_delivering_thumbnail_height);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.gravity = i;
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public static final boolean A0D(MusicOverlayStickerModel musicOverlayStickerModel) {
        C17280tP A00 = C17280tP.A4E.A00();
        if (((Boolean) A00.A1k.CES(A00, C17280tP.A4G[210])).booleanValue() || musicOverlayStickerModel == null || ((C14360o3.A0K(musicOverlayStickerModel.A0E, true) || C14360o3.A0K(musicOverlayStickerModel.A0D, true)) && !musicOverlayStickerModel.A0t)) {
            return true;
        }
        return false;
    }

    public static final MusicOverlayStickerModel A04(C41181vS c41181vS) {
        if (c41181vS.CY4()) {
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                return A03(null, c38321qM, null);
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (!c41181vS.A1Z()) {
            return null;
        }
        C105814ps c105814ps = c41181vS.A0d;
        if (c105814ps != null) {
            return AbstractC50710Ma7.A00.A02(c105814ps.A00.A4b);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final MusicOverlayStickerModel A06(List list) {
        String str;
        String str2;
        MusicOverlayStickerModel A05 = A05(list);
        if (A05 == null) {
            return null;
        }
        if (!A05.A0t && ((str = A05.A0m) == null || str.length() == 0 || (str2 = A05.A0Y) == null || str2.length() == 0)) {
            return null;
        }
        return A05;
    }

    public static final C8GD A07(C38059Gom c38059Gom, MusicOverlayStickerModel musicOverlayStickerModel, Al0 al0, EnumC138556Pl enumC138556Pl, int i) {
        C8GD c24024AlG;
        if (enumC138556Pl.A02()) {
            if (c38059Gom != null) {
                c24024AlG = new C24025AlH(c38059Gom, musicOverlayStickerModel, al0, enumC138556Pl, i);
            } else {
                throw new IllegalStateException("Should be non-null if this is a lyrics sticker");
            }
        } else {
            c24024AlG = new C24024AlG(musicOverlayStickerModel, al0, enumC138556Pl, i);
        }
        return c24024AlG;
    }
}
