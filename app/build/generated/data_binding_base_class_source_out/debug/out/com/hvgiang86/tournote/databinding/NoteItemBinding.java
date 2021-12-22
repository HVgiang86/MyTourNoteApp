// Generated by view binder compiler. Do not edit!
package com.hvgiang86.tournote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hvgiang86.tournote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout itemNote;

  @NonNull
  public final ImageButton itemNoteIbtDelete;

  @NonNull
  public final ImageButton itemNoteIbtEdit;

  @NonNull
  public final ImageButton itemNoteIbtShare;

  @NonNull
  public final ImageView itemNoteIvThumbnail;

  @NonNull
  public final TextView itemNoteTvNoteContent;

  @NonNull
  public final TextView itemNoteTvNoteDescription;

  @NonNull
  public final TextView itemNoteTvNoteId;

  @NonNull
  public final TextView itemNoteTvNoteTitle;

  @NonNull
  public final TextView itemNoteTvTimeMark;

  private NoteItemBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemNote,
      @NonNull ImageButton itemNoteIbtDelete, @NonNull ImageButton itemNoteIbtEdit,
      @NonNull ImageButton itemNoteIbtShare, @NonNull ImageView itemNoteIvThumbnail,
      @NonNull TextView itemNoteTvNoteContent, @NonNull TextView itemNoteTvNoteDescription,
      @NonNull TextView itemNoteTvNoteId, @NonNull TextView itemNoteTvNoteTitle,
      @NonNull TextView itemNoteTvTimeMark) {
    this.rootView = rootView;
    this.itemNote = itemNote;
    this.itemNoteIbtDelete = itemNoteIbtDelete;
    this.itemNoteIbtEdit = itemNoteIbtEdit;
    this.itemNoteIbtShare = itemNoteIbtShare;
    this.itemNoteIvThumbnail = itemNoteIvThumbnail;
    this.itemNoteTvNoteContent = itemNoteTvNoteContent;
    this.itemNoteTvNoteDescription = itemNoteTvNoteDescription;
    this.itemNoteTvNoteId = itemNoteTvNoteId;
    this.itemNoteTvNoteTitle = itemNoteTvNoteTitle;
    this.itemNoteTvTimeMark = itemNoteTvTimeMark;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout itemNote = (LinearLayout) rootView;

      id = R.id.item_note_ibt_delete;
      ImageButton itemNoteIbtDelete = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteIbtDelete == null) {
        break missingId;
      }

      id = R.id.item_note_ibt_edit;
      ImageButton itemNoteIbtEdit = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteIbtEdit == null) {
        break missingId;
      }

      id = R.id.item_note_ibt_share;
      ImageButton itemNoteIbtShare = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteIbtShare == null) {
        break missingId;
      }

      id = R.id.item_note_iv_thumbnail;
      ImageView itemNoteIvThumbnail = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteIvThumbnail == null) {
        break missingId;
      }

      id = R.id.item_note_tv_note_content;
      TextView itemNoteTvNoteContent = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteTvNoteContent == null) {
        break missingId;
      }

      id = R.id.item_note_tv_note_description;
      TextView itemNoteTvNoteDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteTvNoteDescription == null) {
        break missingId;
      }

      id = R.id.item_note_tv_note_id;
      TextView itemNoteTvNoteId = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteTvNoteId == null) {
        break missingId;
      }

      id = R.id.item_note_tv_note_title;
      TextView itemNoteTvNoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteTvNoteTitle == null) {
        break missingId;
      }

      id = R.id.item_note_tv_time_mark;
      TextView itemNoteTvTimeMark = ViewBindings.findChildViewById(rootView, id);
      if (itemNoteTvTimeMark == null) {
        break missingId;
      }

      return new NoteItemBinding((LinearLayout) rootView, itemNote, itemNoteIbtDelete,
          itemNoteIbtEdit, itemNoteIbtShare, itemNoteIvThumbnail, itemNoteTvNoteContent,
          itemNoteTvNoteDescription, itemNoteTvNoteId, itemNoteTvNoteTitle, itemNoteTvTimeMark);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}