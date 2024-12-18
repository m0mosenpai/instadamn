package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.C73053Xug;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public interface NoteEmojiReactionInfoIntf extends Parcelable {
    public static final C73053Xug A00 = C73053Xug.A00;

    NoteReactionType Bkj();

    User CDj();

    Boolean Cf9();

    NoteEmojiReactionInfoIntf E9S(C1DY c1dy);

    NoteEmojiReactionInfo ExK(C1DY c1dy);

    NoteEmojiReactionInfo ExL(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getEmoji();
}
