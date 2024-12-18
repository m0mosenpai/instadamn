package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41656Ibo {
    public static final boolean A02(Context context, JIN jin) {
        C14360o3.A0B(context, 0);
        if (!jin.CSb()) {
            return true;
        }
        String Ay3 = jin.Ay3();
        if (Ay3 != null) {
            C9GR.A09(context, Ay3);
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final SpannableStringBuilder A00(Context context, List list) {
        boolean A1Y = AbstractC25229BEm.A1Y(list);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (AbstractC166987dD.A1b(list)) {
            A01.append((CharSequence) context.getString(2131967995));
            A01.append((CharSequence) ":");
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) list.get(A1Y ? 1 : 0);
            A01.append((CharSequence) " ");
            AbstractC37304Gc5.A0s(A01, originalAudioPartMetadataIntf.getDisplayArtist());
            A01.append((CharSequence) originalAudioPartMetadataIntf.getDisplayTitle());
            if (originalAudioPartMetadataIntf.isExplicit()) {
                A01.append((CharSequence) " ");
                Drawable drawable = context.getDrawable(R.drawable.music_explicit);
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    if (mutate != null) {
                        mutate.setColorFilter(AbstractC31174DnI.A03(context), PorterDuff.Mode.SRC_IN);
                    }
                    drawable.setBounds(A1Y ? 1 : 0, A1Y ? 1 : 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    C4GL.A02(drawable, A01, A01.length(), A1Y ? 1 : 0, A1Y ? 1 : 0);
                }
            }
        }
        return A01;
    }

    public static final ArrayList A01(List list, List list2) {
        C42733IvT c42733IvT;
        AbstractC167017dG.A1N(list, list2);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38061Goo c38061Goo = (C38061Goo) it.next();
            MusicSearchPlaylist musicSearchPlaylist = c38061Goo.A0E;
            Integer num = c38061Goo.A0G;
            if (num == C05F.A0j && musicSearchPlaylist != null) {
                List A0n = AbstractC31171DnF.A0n(musicSearchPlaylist.A01);
                if (AbstractC166987dD.A1b(A0n)) {
                    c42733IvT = ((C38061Goo) AbstractC001800i.A0I(A0n)).A0F;
                    if (c42733IvT == null) {
                    }
                    A1E.add(c38061Goo);
                } else {
                    A1E.add(c38061Goo);
                }
            } else if (num == C05F.A01) {
                c42733IvT = c38061Goo.A0F;
                if (c42733IvT == null && list2.contains(AudioTrackType.A03)) {
                }
                A1E.add(c38061Goo);
            } else {
                if (num == C05F.A0u && musicSearchPlaylist == null) {
                }
                A1E.add(c38061Goo);
            }
        }
        return A1E;
    }
}
