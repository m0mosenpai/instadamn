package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Z8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Z8 {
    public static final void A00(UserSession userSession, C41181vS c41181vS, C144346fG c144346fG) {
        ArrayList arrayList;
        C84823qW c84823qW;
        URN urn;
        Boolean bool;
        List BlY = c41181vS.BlY(EnumC75383a5.A0s);
        if (BlY != null) {
            arrayList = new ArrayList(BlY);
        } else {
            arrayList = null;
        }
        List BlY2 = c41181vS.BlY(EnumC75383a5.A1C);
        if (BlY2 != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(BlY2)) != null && (urn = c84823qW.A0b) != null && (bool = urn.A00) != null && bool.booleanValue()) {
            return;
        }
        A01(userSession, c144346fG, arrayList, c41181vS.A00());
    }

    public static final void A01(UserSession userSession, C144346fG c144346fG, ArrayList arrayList, float f) {
        String str;
        int i;
        int i2;
        int dimensionPixelSize;
        int i3;
        if (arrayList != null && !arrayList.isEmpty()) {
            C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0s, arrayList);
            if (A00 != null && (str = A00.A1h) != null && str.length() != 0) {
                FrameLayout frameLayout = c144346fG.A00;
                if (frameLayout == null) {
                    View inflate = c144346fG.A02.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    frameLayout = (FrameLayout) inflate;
                    View findViewById = frameLayout.findViewById(R.id.music_sound_wave);
                    C14360o3.A0C(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    c144346fG.A01 = (ImageView) findViewById;
                    c144346fG.A00 = frameLayout;
                }
                frameLayout.setVisibility(0);
                MusicOverlayStickerModel musicOverlayStickerModel = A00.A0v;
                if (musicOverlayStickerModel != null) {
                    if (C14360o3.A0K(musicOverlayStickerModel.A0I, true)) {
                        FrameLayout frameLayout2 = c144346fG.A00;
                        if (frameLayout2 != null) {
                            Context context = frameLayout2.getContext();
                            Resources resources = context.getResources();
                            String str2 = A00.A1h;
                            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                            if (!C14360o3.A0K(str2, EnumC138556Pl.A0I.A02) && !C14360o3.A0K(str2, EnumC138556Pl.A0H.A02) && !C14360o3.A0K(str2, EnumC138556Pl.A0F.A02)) {
                                if (C14360o3.A0K(str2, EnumC138556Pl.A0E.A02) || C14360o3.A0K(str2, EnumC138556Pl.A07.A02)) {
                                    C9SQ c9sq = new C210499So(context, userSession, musicOverlayStickerModel, 0, false, false).A08;
                                    i = c9sq.A08;
                                    i2 = c9sq.A05;
                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                                    i3 = (resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size) - dimensionPixelSize) - dimensionPixelSize2;
                                }
                            } else {
                                C9SI c9si = new C210489Sn(context, userSession, musicOverlayStickerModel, 0, false).A06;
                                i = c9si.A09;
                                i2 = c9si.A06;
                                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                                i3 = dimensionPixelSize;
                            }
                            C138586Po A002 = AbstractC138576Pn.A00(0.75f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), false);
                            A002.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
                            int color = context.getColor(R.color.black_30_transparent);
                            A002.A01 = dimensionPixelSize3;
                            A002.A09.setColor(color);
                            A002.invalidateSelf();
                            ImageView imageView = c144346fG.A01;
                            if (imageView != null) {
                                imageView.setImageDrawable(A002);
                                ImageView imageView2 = c144346fG.A01;
                                if (imageView2 != null) {
                                    AbstractC13880nE.A0f(imageView2, i3);
                                    ImageView imageView3 = c144346fG.A01;
                                    if (imageView3 != null) {
                                        AbstractC13880nE.A0e(imageView3, dimensionPixelSize);
                                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
                                        FrameLayout frameLayout3 = c144346fG.A00;
                                        if (frameLayout3 != null) {
                                            AbstractC13880nE.A0r(frameLayout3, new RunnableC24808AyU(A00, c144346fG, f));
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            FrameLayout frameLayout4 = c144346fG.A00;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
        }
    }
}
